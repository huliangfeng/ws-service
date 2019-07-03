package com.nw.service.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("test")
public class TestController {
	
	@RequestMapping("hello")
	@ResponseBody
	public String hello() {
		int i = 1/0;
		System.out.println(i);
		return "hello";
	}
}
