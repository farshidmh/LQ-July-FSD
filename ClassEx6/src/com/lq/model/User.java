package com.lq.model;

public class User {
	
	private String firstName;
	private String lastName;
	

	public User(String firstName, String lastName) {		
		setFirstName(firstName);
		setLastName(lastName);		
	}
	
	public void a() {
		
		getFirstName();
		
	}
	
	String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	
	
	
	

}
