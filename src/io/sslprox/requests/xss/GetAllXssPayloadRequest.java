package io.sslprox.requests.xss;

import io.sslprox.annotations.Request;
import io.sslprox.annotations.Request.Method;
import io.sslprox.requests.Req;
import io.sslprox.responses.xss.GetAllXssPayloadResponse;

public class GetAllXssPayloadRequest extends Req<GetAllXssPayloadResponse>{
	
	@Request(path = "/xss/list", method = Method.GET)
	public GetAllXssPayloadRequest() {
	}
	
}
