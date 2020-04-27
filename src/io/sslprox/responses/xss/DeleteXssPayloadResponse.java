package io.sslprox.responses.xss;

import io.sslprox.responses.Res;

public class DeleteXssPayloadResponse extends Res {

	public static int SUCCESS = 1, ERROR = 2;

	public int status;
	public String msg;

	public DeleteXssPayloadResponse(int status, String msg) {
		this.status = status;
		this.msg = msg;
	}

	public DeleteXssPayloadResponse() {
	}

}
