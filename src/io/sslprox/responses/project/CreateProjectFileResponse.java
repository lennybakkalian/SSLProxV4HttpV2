package io.sslprox.responses.project;

import io.sslprox.responses.Res;

public class CreateProjectFileResponse extends Res {

	public static final int CREATED = 1, NOT_CREATED = 2;

	public int status;
	public String msg;
	public ProjectFileResponse createdFile;

	public CreateProjectFileResponse(int status, String msg, ProjectFileResponse createdFile) {
		this.status = status;
		this.msg = msg;
		this.createdFile = createdFile;
	}
	
	public CreateProjectFileResponse() {
	}

}
