package com.sms;
import java.sql.*;
import com.sms.Controller.*;
import com.sms.util.DBConnection;
public class Main {
	public static void main(String[] args) {
		
		Connection con=null;
		try {
			if(con != null) {
				con.close();
				StudentController controller = new StudentController();
				controller.StartApp();
			}
		}
		catch(SQLException e) {
			System.out.println("Database Connection Failed!.");
			e.printStackTrace();
		}
		
//		to run without JDBC
//		StudentController controller=new StudentController();
//		controller.StartApp();
	}
}
