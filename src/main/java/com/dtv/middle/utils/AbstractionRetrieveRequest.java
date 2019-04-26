package com.dtv.middle.utils;

import java.util.List;

public class AbstractionRetrieveRequest {


	int projectId;	
	int queryId;
	String chartType;
	List<Object> data;
	
	public AbstractionRetrieveRequest() {}
	public AbstractionRetrieveRequest(int projectId, int queryId, String chartType, List<Object> data) {
		super();
		this.projectId = projectId;
		this.queryId = queryId;
		this.chartType = chartType;
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
	public String getChartType() {
		return chartType;
	}
	public void setChartType(String chartType) {
		this.chartType = chartType;
	}
	public List<Object> getData() {
		return data;
	}
	public void setData(List<Object> data) {
		this.data = data;
	}

	
}
