package com.sms.model;
import java.util.*;

public class Student {
	private String Name;
    private int StudentId;
    private String Department;
    private String Email;
    private long PhoneNumber;
    public Student(int StudentId,String Name,String Department,String Email,long PhoneNumber){
    	this.Department=Department;
    	this.Email=Email;
    	this.Name=Name;
    	this.PhoneNumber=PhoneNumber;
    	this.StudentId=StudentId;
    }
    public String getName() {
    	return Name;
    }
    public String getEmail() {
    	return Email;
    }
    public int getId() {
    	return StudentId;
    }
    public String Department() {
    	return Department;
    }
    public long getPhoneNumber() {
    	return PhoneNumber;
    }
    public void setName(String Name) {
    	this.Name=Name;
    }
    public void setStudentId(int StudentId) {
    	this.StudentId=StudentId;
    }
    public void setDepartment(String Department) {
    	this.Department=Department;
    }
    public void setEmail(String Email) {
    	this.Email=Email;
    }
    public void setPhoneNumber(long PhoneNumber) {
    	this.PhoneNumber=PhoneNumber;
    }
	
    public String toString() {
    	return StudentId+" "+"Name"+" "+"Department"+" "+"Email"+" "+PhoneNumber;
    }

	
    
    
}
