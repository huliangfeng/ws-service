package com.nw.service.webservice;

import javax.jws.WebService;

@WebService
public interface TestWebService {

	String show(String name);
	
	String login(String name, String pwd);
	
}
