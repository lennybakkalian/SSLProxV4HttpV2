package io.sslprox.requests.project;

import io.sslprox.annotations.Request;
import io.sslprox.annotations.Request.Method;
import io.sslprox.requests.Req;
import io.sslprox.responses.project.InviteUserToProjectResponse;

public class InviteUserToProjectRequest extends Req<InviteUserToProjectResponse> {

	public String publicid;
	public String name;

	@Request(path = "/project/invite/user", method = Method.POST)
	public InviteUserToProjectRequest(String publicid, String name) {
		this.publicid = publicid;
		this.name = name;
	}

	public InviteUserToProjectRequest() {
	}
}
