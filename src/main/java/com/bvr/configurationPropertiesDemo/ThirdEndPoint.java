package com.bvr.configurationPropertiesDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ThirdEndPoint {

	public ThirdEndPoint() {
		// TODO Auto-generated constructor stub
	}
	
	@Autowired
	ExampleProperties service;
	
	@RequestMapping("/customGreet")
	public String getGreeting(@RequestParam String name) {
		return service.getGreeting() + " : " + name;
	}

}
