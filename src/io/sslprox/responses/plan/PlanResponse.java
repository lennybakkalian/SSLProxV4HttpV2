package io.sslprox.responses.plan;

import io.sslprox.responses.Res;

public class PlanResponse extends Res {

	public String name;
	public String internal_name;
	public String description;
	public float price;

	public PlanResponse(String name, String internal_name, String description, float price) {
		this.name = name;
		this.internal_name = internal_name;
		this.description = description;
		this.price = price;
	}

	public PlanResponse() {
	}

	public String getName() {
		return name;
	}

	public String getInternal_name() {
		return internal_name;
	}

	public String getDescription() {
		return description;
	}

	public float getPrice() {
		return price;
	}

}
