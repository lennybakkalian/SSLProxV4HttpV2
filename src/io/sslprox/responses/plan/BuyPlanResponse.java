package io.sslprox.responses.plan;

import io.sslprox.responses.Res;

public class BuyPlanResponse extends Res {

	public static final int SUCCESS = 1, ERROR = 2;

	public int status;
	public String msg;
	public String paypal_url;

	public BuyPlanResponse(int status, String msg, String paypal_url) {
		this.status = status;
		this.msg = msg;
		this.paypal_url = paypal_url;
	}

	public BuyPlanResponse() {
	}

	public int getStatus() {
		return status;
	}

	public String getMsg() {
		return msg;
	}

	public String getPaypal_url() {
		return paypal_url;
	}
}
