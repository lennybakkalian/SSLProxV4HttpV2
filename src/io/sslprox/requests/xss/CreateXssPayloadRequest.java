package io.sslprox.requests.xss;

import io.sslprox.annotations.Request;
import io.sslprox.annotations.Request.Method;
import io.sslprox.requests.Req;
import io.sslprox.responses.xss.CreateXssPayloadResponse;

public class CreateXssPayloadRequest extends Req<CreateXssPayloadResponse> {

	public String name;

	@Request(path = "/xss/create", method = Method.POST)
	public CreateXssPayloadRequest(String name) {
		this.name = name;
	}
	
	public CreateXssPayloadRequest() {
	}

}
