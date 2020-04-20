package io.sslprox.responses.xss;

import java.util.List;

import io.sslprox.responses.Res;

public class XssPayloadResponse extends Res {

	public String name, publicid, evalCode;
	public List<XssPayloadEntryResponse> entries;

	public XssPayloadResponse(String name, String publicid) {
		this.name = name;
		this.publicid = publicid;
	}

	public String getEvalCode() {
		return evalCode;
	}

	public void setEvalCode(String evalCode) {
		this.evalCode = evalCode;
	}

	public XssPayloadResponse(String name, String publicid, List<XssPayloadEntryResponse> entries) {
		this(name, publicid);
		this.entries = entries;
	}

	public XssPayloadResponse() {
	}
}
