package io.sslprox.requests.project;

import io.sslprox.annotations.Request;
import io.sslprox.annotations.Request.Method;
import io.sslprox.requests.Req;
import io.sslprox.responses.project.ProjectInviteAnswerResponse;

public class ProjectInviteAnswerRequest extends Req<ProjectInviteAnswerResponse> {

	public static final int ACCEPT = 1, DECLINE = 2;

	public String publicid;
	public int choice;

	@Request(path = "/project/invite/choice", method = Method.POST)
	public ProjectInviteAnswerRequest(String publicid, int choice) {
		this.publicid = publicid;
		this.choice = choice;
	}

	public ProjectInviteAnswerRequest() {
	}

}
