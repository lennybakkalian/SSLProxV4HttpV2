package io.sslprox.requests.project;

import io.sslprox.annotations.Request;
import io.sslprox.annotations.Request.Method;
import io.sslprox.requests.Req;
import io.sslprox.responses.project.GetProjectFileResponse;

public class GetProjectFileRequest extends Req<GetProjectFileResponse> {

	public String publicid;
	public String path;
	public String fileid;

	@Request(path = "/project/file", method = Method.GET)
	public GetProjectFileRequest(String publicid, String path, String fileid) {
		this.publicid = publicid;
		this.path = path;
		this.fileid = fileid;
	}

	public GetProjectFileRequest() {
	}

}
