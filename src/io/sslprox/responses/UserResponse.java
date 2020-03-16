package io.sslprox.responses;

public class UserResponse extends Res {

	public String username;

	public UserResponse(String username) {
		this.username = username;
	}

	public UserResponse() {
	}
}
