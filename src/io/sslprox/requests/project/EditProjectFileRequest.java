package io.sslprox.requests.project;

import io.sslprox.annotations.Request;
import io.sslprox.annotations.Request.Method;
import io.sslprox.requests.Req;
import io.sslprox.responses.project.EditProjectFileResponse;

public class EditProjectFileRequest extends Req<EditProjectFileResponse> {

	public String publicid;
	public String path;
	public String fileid;
	public String newName;
	public byte[] newContentBytes;
	public String newContentStr;

	@Request(path = "/project/file", method = Method.PUT)
	public EditProjectFileRequest(String publicid, String path, String fileid, String newName, byte[] newContentBytes, String newContentStr) {
		this.publicid = publicid;
		this.path = path;
		this.fileid = fileid;
		this.newName = newName;
		this.newContentBytes = newContentBytes;
		this.newContentStr = newContentStr;
	}
	
	

	public EditProjectFileRequest() {
	}

}
