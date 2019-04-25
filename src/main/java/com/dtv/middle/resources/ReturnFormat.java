package com.dtv.middle.resources;

public class ReturnFormat {
    private Status status;
    private String message;
    private Object data;
    private Object labels;
    private int pageCount;
	private int AvgCount;
    private int SubCount;


    public ReturnFormat() {
    }

    public ReturnFormat(Status status, String message, Object data,Object labels, int pageCount,int AvgCount,int SubCount) {
        this.status = status;
        this.message = message;
        this.data = data;
        this.labels = labels;
        this.pageCount = pageCount;
        this.AvgCount = AvgCount;
        this.SubCount = SubCount;
    }
    public ReturnFormat(Status status, String message, Object data, int pageCount) {
        this.status = status;
        this.message = message;
        this.data = data;
        this.pageCount = pageCount;
    }
    public ReturnFormat(Object data,Object labels) {
      
        this.data = data;
        this.labels = labels;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    public Object getLabels() {
        return labels;
    }

    public void setLabels(Object labels) {
        this.labels = labels;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
  
    public int getAvgCount() {
		return AvgCount;
	}

	public void setAvgCount(int avgCount) {
		AvgCount = avgCount;
	}

	public int getSubCount() {
		return SubCount;
	}

	public void setSubCount(int subCount) {
		SubCount = subCount;
	}
    public enum Status {
        SUCCESS, ERROR, CREATED, UPDATED, DELETED, FOUND, NOT_FOUND, UNSUCCESS
    }



}