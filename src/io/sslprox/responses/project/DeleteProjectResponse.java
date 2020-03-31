package io.sslprox.responses.project;

import io.sslprox.responses.Res;

public class DeleteProjectResponse extends Res {

	public static final int SUCCESS = 1, ERROR = 2;

	public int status;
	public String msg;

	public DeleteProjectResponse(int status, String msg) {
		this.status = status;
		this.msg = msg;
	}

	public DeleteProjectResponse() {
	}

}
