package com.sms.Controller;
import com.sms.service.*;
import java.util.*;
import com.sms.model.*;
public class StudentController {
	
	StudentService Service=new StudentService();
	Scanner ref=new Scanner(System.in);
	
	public void StartApp() {
		while(true) {
		System.out.println("\n===StudentManagementSystem===\n");
		
		System.out.println("1.AddStudent");
		System.out.println("2.ViewStudent");
		System.out.println("3.SearchStudent");
		System.out.println("4.Exit");
		
		System.out.println("Enter your Choice");
		int choice = ref.nextInt();
		
		switch(choice) {
		case 1:
			AddStudent();
			break;
		case 2:
			ViewStudent();
			break;
		case 3:
			SearchStudent();
			break;
		case 4:
			System.out.println("Thankyou!");
			return;
		default:
			System.out.println("Enter the choice from 1 to 4");
		}
	
	}
}


public void AddStudent() {
	System.out.println("Enter the id of the student");
	int Id=ref.nextInt();
	ref.nextLine();
	System.out.println("Enter the Name of the student");
	String Name=ref.nextLine();
	System.out.println("Enter the Email of the student");
	String Email=ref.nextLine();
	System.out.println("Enter the Department of the student");
	String Department=ref.nextLine();
	System.out.println("Enter the PhoneNumber of the student");
	long PhoneNumber=ref.nextLong();
	
	Student student = new Student(Id,Name,Department,Email,PhoneNumber);
	boolean result=Service.addStudent(student);
	if(result) {
		System.out.println("Added Successfully");
	}
}

public void ViewStudent() {
	List<Student> students=Service.findAll();
	if(students.isEmpty()) {
		System.out.println("No Data");
	}
	else {
		
		System.out.println(students);
	}
}

public void SearchStudent() {
	System.out.println("Enter the StudentId");
	int id=ref.nextInt();
	
	Student student=Service.findById(id);
	if(student !=null) {
		System.out.println(student);
	}
	else {
		System.out.println("Not Available");
	}
}
}
