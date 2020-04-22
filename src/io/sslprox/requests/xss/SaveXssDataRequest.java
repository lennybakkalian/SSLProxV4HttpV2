package io.sslprox.requests.xss;

import io.sslprox.requests.Req;

public class SaveXssDataRequest extends Req {

	public String useragent;
	public String cookies;
	public String location;

	public SaveXssDataRequest(String useragent, String cookies, String location) {
		this.useragent = useragent;
		this.cookies = cookies;
		this.location = location;
	}

	public SaveXssDataRequest() {
	}

}
