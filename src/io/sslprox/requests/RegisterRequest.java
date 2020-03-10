package io.sslprox.requests;

import io.sslprox.annotations.Request;
import io.sslprox.annotations.Request.Method;
import io.sslprox.responses.RegisterResponse;

public class RegisterRequest extends Req<RegisterResponse> {

	public String username;
	public String email;
	public String password;

	@Request(path = "/register", method = Method.POST)
	public RegisterRequest(String username, String email, String password) {
		this.username = username;
		this.email = email;
		this.password = password;
	}

}
