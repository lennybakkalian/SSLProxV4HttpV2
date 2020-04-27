package io.sslprox.requests.xss;

import io.sslprox.annotations.Request;
import io.sslprox.annotations.Request.Method;
import io.sslprox.requests.Req;
import io.sslprox.responses.xss.DeleteXssEntryResponse;

public class DeleteXssEntryRequest extends Req<DeleteXssEntryResponse> {

	public String publicid;

	@Request(path = "/xss/entry/delete", method = Method.POST)
	public DeleteXssEntryRequest(String publicid) {
		this.publicid = publicid;
	}

	public DeleteXssEntryRequest() {
	}

}
