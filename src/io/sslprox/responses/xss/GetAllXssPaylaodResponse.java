package io.sslprox.responses.xss;

import java.util.List;

import io.sslprox.responses.Res;

public class GetAllXssPaylaodResponse extends Res {

	public List<XssPayloadResponse> payloads;

	public GetAllXssPaylaodResponse(List<XssPayloadResponse> payloads) {
		this.payloads = payloads;
	}

	public GetAllXssPaylaodResponse() {
	}

}
