package io.sslprox.requests.project;

import io.sslprox.annotations.Request;
import io.sslprox.annotations.Request.Method;
import io.sslprox.requests.Req;
import io.sslprox.responses.UserResponse;

public class GetCurrentUserRequest extends Req<UserResponse> {
	@Request(path = "/user/self", method = Method.GET)
	public GetCurrentUserRequest() {
	}
}
