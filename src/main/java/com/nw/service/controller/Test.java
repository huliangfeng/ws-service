package com.nw.service.controller;

public class Test {
	
	public String test(boolean b) {
		if (b) {
			throw new RuntimeException("test");
		}
		System.out.println("abc");
		return "1";
	}

	public static void main(String[] args) {
		new Test().test(true);
		System.out.println("abc");
	}
}
