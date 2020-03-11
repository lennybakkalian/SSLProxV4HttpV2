package io.sslprox.requests.project;

import io.sslprox.annotations.Request;
import io.sslprox.annotations.Request.Method;
import io.sslprox.requests.Req;
import io.sslprox.responses.project.ProjectListResponse;

public class ProjectListRequest extends Req<ProjectListResponse> {

	@Request(path = "/projects", method = Method.GET)
	public ProjectListRequest() {
	}
}
