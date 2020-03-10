package io.sslprox.api;

import java.lang.reflect.Constructor;
import java.lang.reflect.ParameterizedType;

import io.sslprox.annotations.Request;
import io.sslprox.requests.Req;
import kong.unirest.HttpRequest;
import kong.unirest.HttpResponse;
import kong.unirest.Unirest;

public class SSLProxApi {

	private String host;
	private String session;

	public SSLProxApi(String host) {
		this.host = host;
	}

	public void setSession(String session) {
		this.session = session;
	}

	public String getSession() {
		return session;
	}

	@SuppressWarnings("unchecked")
	public <T> T call(Req<?> req) throws Exception {
		HttpRequest<?> request = null;
		Request annotation = null;
		for (Constructor<?> c : req.getClass().getConstructors())
			if (c.isAnnotationPresent(Request.class))
				annotation = c.getAnnotation(Request.class);
		if (annotation == null)
			throw new Exception(
					"Annotation \"Request\" in constructor " + req.getClass().getSimpleName() + " not found!");

		String url = host + annotation.path();

		System.out.println("send to " + url);

		switch (annotation.method().name().toLowerCase()) {
		case "post":
			request = Unirest.post(url).body(req);
			break;
		case "put":
			request = Unirest.put(url).body(req);
			break;
		case "delete":
			request = Unirest.delete(url).body(req);
		case "get":
			request = Unirest.get(url);
			break;
		default:

			return null;
		}
		request = request.header("x-sslprox-session", session);
		HttpResponse<T> res = (HttpResponse<T>) request.asObject(
				((Class.forName(((ParameterizedType) req.getClass().getGenericSuperclass()).getActualTypeArguments()[0]
						.toString().split(" ")[1]))));
		T body = res.getBody();
		return body;

	}

	public void async(Req<?> req, SSLProxResHandler handler) {
		new Thread(() -> {
			try {
				handler.handleResponse(call(req));
			} catch (Exception e) {
				handler.handleException(e);
			}
		}).start();
	}

}
