package io.sslprox.requests.xss;

import io.sslprox.annotations.Request;
import io.sslprox.annotations.Request.Method;
import io.sslprox.requests.Req;
import io.sslprox.responses.xss.XssPayloadResponse;

public class XssPayloadRequest extends Req<XssPayloadResponse> {
	
	public String publicid;
	
	@Request(path = "/xss/get", method = Method.POST)
	public XssPayloadRequest(String publicid) {
		this.publicid = publicid;
	}
	
}
