package com.xworkz.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class CarController {
	
	public CarController() {
		System.out.println("CarController() is Invoked");
	}
	@RequestMapping("/getForm")
	public String getForm() {
		System.out.println("getForm() is Invoked");
		return "/WEB-INF/CarPage.jsp";
	}
}
