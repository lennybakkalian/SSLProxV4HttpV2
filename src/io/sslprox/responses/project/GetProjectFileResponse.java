package io.sslprox.responses.project;

import io.sslprox.responses.Res;

public class GetProjectFileResponse extends Res {

	public static final int FOUND = 1, NOT_FOUND = 2;

	public int status;
	public ProjectFileResponse file;

	public GetProjectFileResponse(int status, ProjectFileResponse file) {
		this.status = status;
		this.file = file;
	}

	public GetProjectFileResponse() {
	}

}
