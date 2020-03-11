package io.sslprox.responses.project;

import io.sslprox.responses.Res;

public class DeleteProjectFileResponse extends Res {

	public static final int DELETED = 1, NOT_DELETED = 2;

	public int status;
	public String msg;

	public DeleteProjectFileResponse(int status, String msg) {
		this.status = status;
		this.msg = msg;
	}

	public DeleteProjectFileResponse() {
	}

}
