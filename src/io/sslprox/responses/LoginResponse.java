package io.sslprox.responses;

public class LoginResponse extends Res {
	public static final int SUCCESS = 1, INVALID_CREDENTIALS = 2;

	public int status;
	public String msg;
	public String session;

	public LoginResponse(int status, String msg, String session) {
		this.status = status;
		this.msg = msg;
		this.session = session;
	}

	public LoginResponse() {
	}
}
