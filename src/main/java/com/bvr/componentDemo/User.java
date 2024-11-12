package com.bvr.componentDemo;

import java.util.Date;

//DTO (Data Transfer Object, object with multiple data to transfer)
public class User {

	public User() {
		// TODO Auto-generated constructor stub
	}
	
	private int id;
	private String name;
	private Date date;
	
	public User(int id, String name, Date date) {
		super();
		this.id = id;
		this.name = name;
		this.date = date;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + "]";
	}
	
	
	

}
