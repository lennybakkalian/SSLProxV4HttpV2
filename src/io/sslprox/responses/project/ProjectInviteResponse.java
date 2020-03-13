package io.sslprox.responses.project;

import io.sslprox.responses.Res;
import io.sslprox.responses.UserResponse;

public class ProjectInviteResponse extends Res {

	public String publicid;
	public String name;
	public UserResponse invitedBy;

	public ProjectInviteResponse(String publicid, String name, UserResponse invitedBy) {
		this.publicid = publicid;
		this.name = name;
		this.invitedBy = invitedBy;
	}

	public ProjectInviteResponse() {
	}
	
	

}
