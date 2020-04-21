package io.sslprox.responses.xss;

import java.util.List;

import io.sslprox.responses.Res;

public class GetAllXssPayloadResponse extends Res {

	public List<XssPayloadResponse> payloads;

	public GetAllXssPayloadResponse(List<XssPayloadResponse> payloads) {
		this.payloads = payloads;
	}

	public GetAllXssPayloadResponse() {
	}

}
