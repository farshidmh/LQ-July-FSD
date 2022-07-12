package com.lq.ex;

public class Employee {
	
	private String firstName;
	private String lastName;
	private String ssn;
	private int salary;
	
	public Employee( String fn, String ln, String ssn, int salary ) {		
		this(fn,ln,ssn);		
		setSalary(salary);		
	}
	
	public Employee( String fn, String ln, String ssn ) {		
		this(fn,ln);
		setSsn(ssn);		
	}
	
	public Employee( String fn, String ln ) {		
		setFirstName(fn);	
		setLastName(ln);	
	}
	
	
	

	public String getFirstName() {
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

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	
	
	
	
	
	
	
	
	
	
	

}
