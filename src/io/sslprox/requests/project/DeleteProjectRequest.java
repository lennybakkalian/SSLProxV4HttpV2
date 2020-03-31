package io.sslprox.requests.project;

import io.sslprox.annotations.Request;
import io.sslprox.annotations.Request.Method;
import io.sslprox.requests.Req;
import io.sslprox.responses.project.DeleteProjectResponse;

public class DeleteProjectRequest extends Req<DeleteProjectResponse> {

	public String publicid;

	@Request(path = "/project", method = Method.DELETE)
	public DeleteProjectRequest(String publicid) {
		this.publicid = publicid;
	}

	public DeleteProjectRequest() {
	}

}
