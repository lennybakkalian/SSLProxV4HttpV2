package io.sslprox.responses.project;

import io.sslprox.responses.Res;

public class InviteUserToProjectResponse extends Res {

	public static final int INVITED = 1, NOT_INVITED = 2;

	public int status;
	public String msg;

	public InviteUserToProjectResponse(int status, String msg) {
		this.status = status;
		this.msg = msg;
	}

	public InviteUserToProjectResponse() {
	}
}
