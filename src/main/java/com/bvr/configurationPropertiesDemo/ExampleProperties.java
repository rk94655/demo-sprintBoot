package com.bvr.configurationPropertiesDemo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("oracleproperties")
public class ExampleProperties {

	public ExampleProperties() {
		// TODO Auto-generated constructor stub
	}
	
	
	public ExampleProperties(String greeting) {
		super();
		this.greeting = greeting;
	}



	private String greeting = "Thank you";

	public String getGreeting() {
		return greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}

	@Override
	public String toString() {
		return "ExampleProperties [greeting=" + greeting + "]";
	}
	
	

}
