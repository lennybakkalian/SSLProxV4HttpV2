package io.sslprox.requests.plan;

import io.sslprox.annotations.Request;
import io.sslprox.annotations.Request.Method;
import io.sslprox.requests.Req;
import io.sslprox.responses.plan.BuyPlanResponse;

public class BuyPlanRequest extends Req<BuyPlanResponse> {

	public String name;

	@Request(path = "/plan/buy", method = Method.POST)
	public BuyPlanRequest(String name) {
		this.name = name;
	}

	public BuyPlanRequest() {
	}

	public String getName() {
		return name;
	}

}
