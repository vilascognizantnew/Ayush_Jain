package com.cts.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	
	
	@GetMapping(value = "/hello")
	public String getHelloMessage()
	{
		
		return "Hello";
	}
	
	
	@GetMapping(value = "/")
	public String getIndex()
	{
		
		return "WelCome To Spring Boot";
	}
	

	
	
	
	

}
