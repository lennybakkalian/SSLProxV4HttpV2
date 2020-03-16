package io.sslprox.responses.project;

import io.sslprox.responses.Res;

public class RemoveProjectUserResponse extends Res {

	public static final int REMOVED = 1, NOT_REMOVED = 2;

	public int status;
	public String msg;

	public RemoveProjectUserResponse(int status, String msg) {
		this.status = status;
		this.msg = msg;
	}

	public RemoveProjectUserResponse() {
	}

}
