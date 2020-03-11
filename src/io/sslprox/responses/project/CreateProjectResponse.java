package io.sslprox.responses.project;

import io.sslprox.responses.Res;

public class CreateProjectResponse extends Res {

	public static final int CREATED = 1, NOT_CREATED = 2;

	public int status;
	public String msg;

	public CreateProjectResponse(int status, String msg) {
		this.status = status;
		this.msg = msg;
	}

	public CreateProjectResponse() {
	}

}
