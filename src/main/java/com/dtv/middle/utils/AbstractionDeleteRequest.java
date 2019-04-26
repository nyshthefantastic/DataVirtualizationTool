package com.dtv.middle.utils;

public class AbstractionDeleteRequest {
	int projectId;	
	int queryId;
	String pid;
	
	public AbstractionDeleteRequest() {}
	public AbstractionDeleteRequest(int projectId, int queryId, String pid) {
		super();
		this.projectId = projectId;
		this.queryId = queryId;
		this.pid = pid;
	}
	
	public int getProjectId() {
		return projectId;
	}
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	public int getQueryId() {
		return queryId;
	}
	public void setQueryId(int queryId) {
		this.queryId = queryId;
	}
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	
}
