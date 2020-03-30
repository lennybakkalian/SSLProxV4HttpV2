package io.sslprox.requests.plan;

import io.sslprox.annotations.Request;
import io.sslprox.annotations.Request.Method;
import io.sslprox.requests.Req;
import io.sslprox.responses.plan.PlanListResponse;

public class PlanListRequest extends Req<PlanListResponse> {

	@Request(path = "/plan/list", method = Method.GET)
	public PlanListRequest() {
	}

}
