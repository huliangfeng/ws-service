package com.nw.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nw.service.webservice.PetWebService;

public class WSClient {
	
	public String test() {
		try {
			System.out.println(1/0);
			//System.out.println("sss");
			//return "3";
		} catch (Exception e) {
			e.printStackTrace();
			//throw e;
			//return "1";
		} finally {
			System.out.println("finally");
			//return "0";
		}
		System.out.println("123");
		return "0";
	}

	public static void main(String[] args) throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-client.xml");
		PetWebService helloService = context.getBean("petWeb",PetWebService.class);
		String result = helloService.getPetImmuneInfo("18773808783", "王乐");
		System.out.println(result);
	}


	
}
