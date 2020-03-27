package io.sslprox.api;

import java.lang.reflect.Constructor;
import java.lang.reflect.ParameterizedType;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.sslprox.annotations.Request;
import io.sslprox.requests.LoginRequest;
import io.sslprox.requests.Req;
import io.sslprox.requests.project.GetCurrentUserRequest;
import io.sslprox.responses.LoginResponse;
import io.sslprox.responses.Res;
import io.sslprox.responses.UserResponse;
import kong.unirest.HttpRequest;
import kong.unirest.HttpResponse;
import kong.unirest.Unirest;

public class SSLProxApi {

	private String host;
	private String session;
	private UserResponse currentUser;

	private ApiEvent event;

	public SSLProxApi(String host) {
		this.host = host;
	}

	public void setEvent(ApiEvent event) {
		this.event = event;
	}

	public ApiEvent getEvent() {
		return event;
	}

	public void setSession(String session) {
		this.session = session;
		if (session == null) {
			currentUser = null;
			return;
		}
		try {
			currentUser = call(new GetCurrentUserRequest());
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("cant get current user - invalid session?");
		}
	}

	public UserResponse getCurrentUser() {
		return currentUser;
	}

	public String getSession() {
		return session;
	}

	@SuppressWarnings("unchecked")
	public <T> T call(Req<?> req) throws Exception {
		String bodyStr = null;
		try {
			HttpRequest<?> request = null;
			Request annotation = null;
			for (Constructor<?> c : req.getClass().getConstructors())
				if (c.isAnnotationPresent(Request.class))
					annotation = c.getAnnotation(Request.class);
			if (annotation == null)
				throw new Exception(
						"Annotation \"Request\" in constructor " + req.getClass().getSimpleName() + " not found!");

			String url = host + annotation.path();

			switch (annotation.method().name().toLowerCase()) {
			case "post":
				request = Unirest.post(url).body(req);
				break;
			case "put":
				request = Unirest.put(url).body(req);
				break;
			case "delete":
				request = Unirest.delete(url).body(req);
				break;
			case "get":
				request = Unirest.get(url);
				break;
			default:
				System.out.println("undefined method in SSLProxApi: " + annotation.method());
				return null;
			}
			request = request.header("x-sslprox-session", session);
			request.header("Content-Type", "application/json");
			Class<?> clazz = ((Class
					.forName(((ParameterizedType) req.getClass().getGenericSuperclass()).getActualTypeArguments()[0]
							.toString().split(" ")[1])));

			ObjectMapper mapper = new ObjectMapper();

			if (event != null)
				event.onReq(req);

			HttpResponse<String> res = request.asString();

			bodyStr = res.getBody();

			if (bodyStr.contains("invalid_session"))
				throw new Exception("Invalid Session");

			// System.out.println(bodyStr);

			// System.out.println(request.getBody().get().toString());

			T body = (T) mapper.readValue(bodyStr, clazz);

			// autosave session
			if (req instanceof LoginRequest && ((LoginResponse) body).status == LoginResponse.SUCCESS) {
				LoginResponse lRes = (LoginResponse) body;
				setSession(lRes.session);
			}

			if (event != null)
				event.onRes(req, body, bodyStr);

			return body;
		} catch (Exception e) {
			if (event != null)
				event.onErr(req, bodyStr, e);
			throw e;
		}
	}

	public void async(Req<?> req, SSLProxResHandler handler) {
		new Thread(() -> {
			try {
				handler.handleResponse(call(req));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}).start();
	}

	public static abstract class ApiEvent {
		public abstract void onReq(Req<?> req);

		public abstract <T> void onRes(Req<?> req, T res, String rawRes);

		public abstract void onErr(Req<?> req, String res, Exception ex);
	}

}
