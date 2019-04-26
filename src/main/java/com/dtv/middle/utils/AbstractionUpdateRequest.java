package com.dtv.middle.utils;

import java.util.List;

public class AbstractionUpdateRequest {
	int projectId;
	int queryId;
	List<Object> data;
	String pid;
	
	public AbstractionUpdateRequest() {}
	public AbstractionUpdateRequest(int projectId, int queryId, List<Object> data, String pid) {
		super();
		this.projectId = projectId;
		this.queryId = queryId;
		this.data = data;
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
	public List<Object> getData() {
		return data;
	}
	public void setData(List<Object> data) {
		this.data = data;
	}
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	
}
