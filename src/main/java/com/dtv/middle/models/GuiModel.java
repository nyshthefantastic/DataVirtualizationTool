package com.dtv.middle.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "guimodel")
public class GuiModel {

	@Column(name = "projectId")
	int projectId;
	@Id
	@Column(name = "queryId")
	int queryId;
	@Column(name = "query")
	String query;

	public GuiModel() {
	}

	public GuiModel(int projectId, int queryId, String query) {
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
