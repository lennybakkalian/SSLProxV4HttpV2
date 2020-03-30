package io.sslprox.responses;

public class UserResponse extends Res {

	public String username;
	public String plan;
	public int plan_rest_days;

	public UserResponse(String username) {
		this.username = username;
	}

	public UserResponse(String username, String plan, int plan_rest_days) {
		this.username = username;
		this.plan = plan;
		this.plan_rest_days = plan_rest_days;
	}

	public UserResponse() {
	}
}
