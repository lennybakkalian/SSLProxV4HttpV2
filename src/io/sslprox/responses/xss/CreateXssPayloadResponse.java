package io.sslprox.responses.xss;

import io.sslprox.responses.Res;

public class CreateXssPayloadResponse extends Res {

	public static final int CREATED = 1, ERROR = 2;

	public int status;
	public String msg;

	public CreateXssPayloadResponse(int status, String msg) {
		this.status = status;
		this.msg = msg;
	}

}
