package io.sslprox.requests.xss;

import io.sslprox.annotations.Request;
import io.sslprox.annotations.Request.Method;
import io.sslprox.requests.Req;
import io.sslprox.responses.xss.DeleteXssPayloadResponse;

public class DeleteXssPayloadRequest extends Req<DeleteXssPayloadResponse> {

	public String publicid;

	@Request(path = "/xss/payload", method = Method.DELETE)
	public DeleteXssPayloadRequest(String publicid) {
		this.publicid = publicid;
	}

	public DeleteXssPayloadRequest() {
	}

}
