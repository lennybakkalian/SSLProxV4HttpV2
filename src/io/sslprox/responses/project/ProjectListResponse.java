package io.sslprox.responses.project;

import java.util.List;

import io.sslprox.responses.Res;

public class ProjectListResponse extends Res {

	public List<ProjectResponse> projects;
	public List<ProjectInviteResponse> invitedProjects;

	public ProjectListResponse(List<ProjectResponse> projects, List<ProjectInviteResponse> invitedProjects) {
		this.projects = projects;
		this.invitedProjects = invitedProjects;
	}

	public ProjectListResponse() {
	}

}
