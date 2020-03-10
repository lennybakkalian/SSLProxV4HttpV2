package io.sslprox.requests.project;

import io.sslprox.annotations.Request;
import io.sslprox.annotations.Request.Method;
import io.sslprox.requests.Req;
import io.sslprox.responses.project.CreateProjectResponse;

public class CreateProjectRequest extends Req<CreateProjectResponse> {

	public String name;
	public String description;

	@Request(path = "/project", method = Method.POST)
	public CreateProjectRequest(String name, String description) {
		this.name = name;
		this.description = description;
	}

}
