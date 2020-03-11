package io.sslprox.responses.project;

import java.util.List;

public class ProjectFileResponse {

	public String name;
	public String type;
	public String fileid;
	public byte[] content;
	public List<ProjectFileResponse> children;

	public ProjectFileResponse(String name, String type, String fileid, byte[] content, List<ProjectFileResponse> children) {
		this.name = name;
		this.type = type;
		this.fileid = fileid;
		this.children = children;
		this.content = content;
	}

	public ProjectFileResponse() {
	}

}
