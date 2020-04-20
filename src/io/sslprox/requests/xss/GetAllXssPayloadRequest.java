package io.sslprox.requests.xss;

import io.sslprox.annotations.Request;
import io.sslprox.annotations.Request.Method;
import io.sslprox.requests.Req;
import io.sslprox.responses.Res;

public class GetAllXssPayloadRequest extends Req<Res>{
	
	@Request(path = "/xss/list", method = Method.GET)
	public GetAllXssPayloadRequest() {
	}
	
}
