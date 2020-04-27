package io.sslprox.responses.xss;

import io.sslprox.responses.Res;

public class XssPayloadEntryResponse extends Res {

	public String ip, useragent, cookies, location, publicid;

	public XssPayloadEntryResponse(String ip, String useragent, String cookies, String location, String publicid) {
		this.ip = ip;
		this.useragent = useragent;
		this.cookies = cookies;
		this.location = location;
		this.publicid = publicid;
	}

	public XssPayloadEntryResponse() {
	}
}
