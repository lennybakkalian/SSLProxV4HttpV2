package io.sslprox.responses.project;

import java.util.List;

import io.sslprox.responses.UserResponse;

public class ProjectResponse {

	public String name, description, publicid;
	public List<ProjectFileResponse> root;
	public UserResponse creator;

	public ProjectResponse(String name, String description, String publicid, List<ProjectFileResponse> root,
			UserResponse creator) {
		this.name = name;
		this.description = description;
		this.publicid = publicid;
		this.root = root;
		this.creator = creator;
	}

	public ProjectResponse() {
	}

}
