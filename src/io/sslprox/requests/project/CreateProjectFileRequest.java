package io.sslprox.requests.project;

import io.sslprox.annotations.Request;
import io.sslprox.annotations.Request.Method;
import io.sslprox.requests.Req;
import io.sslprox.responses.project.CreateProjectFileResponse;
import io.sslprox.types.ProjectFileType;

public class CreateProjectFileRequest extends Req<CreateProjectFileResponse> {

	public String publicid;
	public String name;
	public String content;
	public String type;

	@Request(path = "/project/file", method = Method.POST)
	public CreateProjectFileRequest(String publicid, String name, ProjectFileType type, String content) {
		this.publicid = publicid;
		this.name = name;
		this.type = type.name().toLowerCase();
		this.content = content;
	}
}
