package com.nw.service.vo;

public class ResultEntity<T> {

	private String code;
	
	private String msg;
	
	private T obj;

	public ResultEntity() {
		this.code = "success";
		this.msg = "success";
	}
	
	public ResultEntity(String code, String msg) {
		this.code = code;
		this.msg = msg;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}
	
	
	
}
