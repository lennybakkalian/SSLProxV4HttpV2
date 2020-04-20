package io.sslprox.responses.xss;

import io.sslprox.responses.Res;

public class XssPayloadEntryResponse extends Res {

	public String ip, useragent, cookies;

	public XssPayloadEntryResponse(String ip, String useragent, String cookies) {
		this.ip = ip;
		this.useragent = useragent;
		this.cookies = cookies;
	}

	public XssPayloadEntryResponse() {
	}
}
