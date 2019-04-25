package com.dtv.middle.utils;

public class DashboardRequest {
	int projectId;
	int queryId;
	String query;

	public DashboardRequest() {
	}

	public DashboardRequest(int projectId, int queryId, String query) {
		super();
		this.projectId = projectId;
		this.queryId = queryId;
		this.query = query;
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

	public String getQuery() {
		return query;
	}

	public void setQuery(String query) {
		this.query = query;
	}

}
