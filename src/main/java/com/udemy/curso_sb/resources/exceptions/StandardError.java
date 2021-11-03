package com.udemy.curso_sb.resources.exceptions;

import java.io.Serializable;

public class StandardError implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Integer status;
	private String msg;
	private Long timeStmap;
	
	public StandardError(Integer status, String msg, Long timeStmap) {
		super();
		this.status = status;
		this.msg = msg;
		this.timeStmap = timeStmap;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Long getTimeStmap() {
		return timeStmap;
	}

	public void setTimeStmap(Long timeStmap) {
		this.timeStmap = timeStmap;
	}
	
	

}
