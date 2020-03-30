package io.sslprox.responses.plan;

import java.util.List;

import io.sslprox.responses.Res;

public class PlanListResponse extends Res {

	public List<PlanResponse> plans;

	public PlanListResponse(List<PlanResponse> plans) {
		this.plans = plans;
	}

	public PlanListResponse() {
	}

	public List<PlanResponse> getPlans() {
		return plans;
	}

}
