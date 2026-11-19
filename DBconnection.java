package com.sms.util;
import java.sql.*;
public class DBConnection {
	public static Connection getConnection() {
		Connection con=null;
		
		
		try {
			String url="";
			String username="root";
			String password="Password";
			con=DriverManager.getConnection(url,username,password);
		}
		catch (SQLException e){
			e.printStackTrace();
		}
		return con;
	}
}
