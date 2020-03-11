package io.sslprox.responses.project;

import java.util.List;

import io.sslprox.responses.Res;

public class ProjectListResponse extends Res {

	public List<ProjectResponse> projects;

	public ProjectListResponse(List<ProjectResponse> projects) {
		this.projects = projects;
	}

	public ProjectListResponse() {
	}

}
