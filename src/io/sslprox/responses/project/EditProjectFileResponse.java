package io.sslprox.responses.project;

import io.sslprox.responses.Res;

public class EditProjectFileResponse extends Res {

	public static final int EDITED = 1, NOT_EDITED = 2;

	public int status;
	public String msg;

	public EditProjectFileResponse(int status, String msg) {
		this.status = status;
		this.msg = msg;
	}

	public EditProjectFileResponse() {
	}

}
