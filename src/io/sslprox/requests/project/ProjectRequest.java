package io.sslprox.requests.project;

import io.sslprox.annotations.Request;
import io.sslprox.annotations.Request.Method;
import io.sslprox.requests.Req;
import io.sslprox.responses.project.ProjectResponse;

public class ProjectRequest extends Req<ProjectResponse>{

	public String publicid;

	@Request(path = "/project/view", method = Method.POST)
	public ProjectRequest(String publicid) {
		this.publicid = publicid;
	}

	public ProjectRequest() {
	}

}
