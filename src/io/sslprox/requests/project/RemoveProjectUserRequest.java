package io.sslprox.requests.project;

import io.sslprox.annotations.Request;
import io.sslprox.annotations.Request.Method;
import io.sslprox.requests.Req;
import io.sslprox.responses.project.RemoveProjectUserResponse;

public class RemoveProjectUserRequest extends Req<RemoveProjectUserResponse> {

	public String publicid;
	public String username;

	@Request(path = "/project/remove/user", method = Method.POST)
	public RemoveProjectUserRequest(String publicid, String username) {
		this.publicid = publicid;
		this.username = username;
	}

	public RemoveProjectUserRequest() {
	}

}
