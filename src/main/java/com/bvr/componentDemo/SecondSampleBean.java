package com.bvr.componentDemo;

public class SecondSampleBean {
	private String message;
	private int id;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "SecondSampleBean [message=" + message + "]";
	}

	public SecondSampleBean(String message) {
		super();
		this.message = message;
	}
	

}
