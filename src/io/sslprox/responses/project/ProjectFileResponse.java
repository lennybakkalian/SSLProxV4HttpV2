package io.sslprox.responses.project;

import java.util.List;

public class ProjectFileResponse {

	public String name;
	public String type;
	public List<ProjectFileResponse> children;

	public ProjectFileResponse(String name, String type, List<ProjectFileResponse> children) {
		this.name = name;
		this.type = type;
		this.children = children;
	}

	public ProjectFileResponse() {
	}

}
