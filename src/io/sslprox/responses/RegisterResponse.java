package io.sslprox.responses;

public class RegisterResponse extends Res {
	public static final int CREATED = 1, NOT_CREATED = 2;

	public int status;
	public String msg;

	public RegisterResponse(int status, String msg) {
		this.status = status;
		this.msg = msg;
	}

	public RegisterResponse() {
	}
}
