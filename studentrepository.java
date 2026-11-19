package com.sms.repository;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import com.sms.model.*;
import com.sms.util.DBConnection;

public class StudentRepository {
	
	public boolean add(Student student) {
		String sql="INSERT INTO student VALUES(?,?,?,?,?)";
		try(Connection con=DBConnection.getConnection();
			PreparedStatement ps=con.prepareStatement(sql)) {
			ps.setInt(1, student.getId());
			ps.setString(2, student.getName());
			ps.setString(3, student.getDepartment());
			ps.setString(4, student.getEmail());
			ps.setLong(5, student.getPhoneNumber());
			ps.executeUpdate();
		}
		catch(SQLException e){
			e.printStackTrace();
		}	
		return false;
	}
}
//	private List<Student> students=new ArrayList<>();
//	public boolean addStudent(Student student) {
//		students.add(student);
//		return true;
//	}
//    public List<Student> findAll(){
//    	return students;
//    }
//    public Student findById(int id) {
//    	for(Student student:students) {
//    		if(student.getId()==id) {
//    			return student;
//    		}
//    	}
//    
//    	return null;
//    }
