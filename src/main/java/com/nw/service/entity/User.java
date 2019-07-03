package com.nw.service.entity;

import org.springframework.util.StringUtils;

public class User {
	
	/**  
	 * 用户手机号码
	 */
	private String userPhone = "";
	
	/**
	 * 用户姓名
	 */
	private String userName = "";
	
	/**
	 * 用户地址
	 */
	private String userAddr = "";
	
	public void initDefaultObject() {
		if (StringUtils.isEmpty(this.userPhone)) {
			this.userPhone = "";
		}
		if (StringUtils.isEmpty(this.userName)) {
			this.userName = "";
		}
		if (StringUtils.isEmpty(this.userAddr)) {
			this.userAddr = "";
		}
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserAddr() {
		return userAddr;
	}

	public void setUserAddr(String userAddr) {
		this.userAddr = userAddr;
	}
	
	

}
