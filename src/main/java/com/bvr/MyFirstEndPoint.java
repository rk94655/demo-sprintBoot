package com.bvr;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bvr.componentDemo.SecondSampleBean;

@RestController
public class MyFirstEndPoint {
	@RequestMapping("/endPoint")
	public String getGreeting() {
		return "My first end point";
	}
	
	@RequestMapping("/greet")
	public String greetMe(@RequestParam String name) {
		return "Hello "+name;
	}

	@GetMapping(path = "/third/{name}")
	public String greetMe1(@PathVariable String name) {
		return "Hello using path "+name;
	}
	
	@GetMapping("/fourth")
	public SecondSampleBean greet2() {
		return new SecondSampleBean("Hello from server");
	}
}
