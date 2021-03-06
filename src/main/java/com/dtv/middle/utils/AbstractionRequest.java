package com.dtv.middle.utils;

import java.util.List;

public class AbstractionRequest {

	int projectId;
	int queryId;
	List<Object> data;

	public AbstractionRequest() {
	}

	public AbstractionRequest(int projectId, int queryId, List<Object> data) {
		super();
		this.projectId = projectId;
		this.queryId = queryId;
		this.data = data;
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

}
