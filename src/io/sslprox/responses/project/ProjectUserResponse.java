package io.sslprox.responses.project;

import io.sslprox.responses.Res;
import io.sslprox.responses.UserResponse;

public class ProjectUserResponse extends Res {

	public UserResponse user;

	public ProjectUserResponse(UserResponse user) {
		this.user = user;
	}

	public ProjectUserResponse() {
	}

}
