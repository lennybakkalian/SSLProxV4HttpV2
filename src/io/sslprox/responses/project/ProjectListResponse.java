package io.sslprox.responses.project;

import java.util.List;

public class ProjectListResponse {

	public List<ProjectResponse> projects;

	public ProjectListResponse(List<ProjectResponse> projects) {
		this.projects = projects;
	}

	public ProjectListResponse() {
	}

}
