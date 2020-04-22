package io.sslprox.responses.xss;

import io.sslprox.responses.Res;

public class XssPayloadEntryResponse extends Res {

	public String ip, useragent, cookies, location;

	public XssPayloadEntryResponse(String ip, String useragent, String cookies, String location) {
		this.ip = ip;
		this.useragent = useragent;
		this.cookies = cookies;
		this.location = location;
	}

	public XssPayloadEntryResponse() {
	}
}
