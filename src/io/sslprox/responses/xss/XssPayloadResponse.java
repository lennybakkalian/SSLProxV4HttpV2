package io.sslprox.responses.xss;

import java.util.List;

import io.sslprox.responses.Res;

public class XssPayloadResponse extends Res {

	public String name, publicid, evalCode;
	public List<XssPayloadEntryResponse> entries;

	public XssPayloadResponse(String name, String publicid, String evalCode) {
		this.name = name;
		this.publicid = publicid;
		this.evalCode = evalCode;
	}

	public XssPayloadResponse(String name, String publicid, String evalCode, List<XssPayloadEntryResponse> entries) {
		this(name, publicid, evalCode);
		this.entries = entries;
	}

	public XssPayloadResponse() {
	}
}
