package com.sms.service;
import java.util.List;
import com.sms.model.student;
public class studentsevice {
	public interface students{
		public boolean addstudent();
		public List<student>findAll();
		public int findById(int id);
		
	}

}
