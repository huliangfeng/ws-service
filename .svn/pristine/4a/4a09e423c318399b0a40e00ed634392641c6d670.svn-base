package com.nw.service.webservice.impl;

import org.springframework.stereotype.Component;

import com.nw.service.webservice.TestWebService;

@Component("testWebService")
public class TestWebServiceImpl implements TestWebService {

	@Override
	public String show(String name) {
		System.out.println("服务器发生调用");
		return null;
	}

	@Override
	public String login(String name, String pwd) {
		System.out.println("name:" + name + "====pwd:" + pwd);
		return name + ";" + pwd;
	}

}
