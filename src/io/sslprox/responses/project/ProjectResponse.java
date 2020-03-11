package io.sslprox.responses.project;

import java.util.List;

import io.sslprox.responses.Res;
import io.sslprox.responses.UserResponse;

public class ProjectResponse extends Res {

	public String name, description, publicid;
	public List<ProjectFileResponse> root;
	public UserResponse creator;
	public List<ProjectUserResponse> members;

	public ProjectResponse(String name, String description, String publicid, List<ProjectFileResponse> root,
			UserResponse creator, List<ProjectUserResponse> members) {
		this.name = name;
		this.description = description;
		this.publicid = publicid;
		this.root = root;
		this.creator = creator;
		this.members = members;
	}

	public ProjectResponse() {
	}

}
