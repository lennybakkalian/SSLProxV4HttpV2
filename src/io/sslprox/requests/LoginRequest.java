package io.sslprox.requests;

import io.sslprox.annotations.Request;
import io.sslprox.annotations.Request.Method;
import io.sslprox.responses.LoginResponse;

public class LoginRequest extends Req<LoginResponse> {

	public String username, password;

	@Request(path = "/login", method = Method.POST)
	public LoginRequest(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public LoginRequest() {
	}

}
