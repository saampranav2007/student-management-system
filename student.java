package com.sms.model;

public class student {
	private int StudentId;
	private String StudentName;
	private String Department;
	private String Email;
	private long PhoneNumber;
	
	Student(int StudentId ,String StudentName ,String Department ,String Email ,long PhoneNumber){
		this.StudentId=StudentId;
		this.StudentName=StudentName;
		this.Department=Department;
		this.Email=Email;
		this.PhoneNumber=PhoneNumber;
		
	}
	public int getId() {
		return StudentId;
		
	}
	public void setId(int StudentId) {
		this.StudentId=StudentId;
	}
	public String getName() {
		return StudentName;
		
	}
	public void setName(String StudentName) {
		this.StudentName=StudentName;
	}
	public String getEmail() {
		return StudentEmail;
		
	}
	public void setEmail(String StudentEmail) {
		this.StudentEmail=StudentEmail;
	}
	

}
