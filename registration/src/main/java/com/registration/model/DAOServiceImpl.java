package com.registration.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.registration.model.DAOService;

public class DAOServiceImpl implements DAOService {
	
	private Connection con;
	
	private Statement stmt;

	@Override
	public boolean verifyCredentials(String email, String password) {
		
		try {
			ResultSet result = stmt.executeQuery("select * from login where email='"+email+"' and password= '"+password+"' ");
			return result.next();
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		return false;
	}

	@Override
	public void saveRegistration(String name, String city, String email, String mobile) {
		

	}

	@Override
	public void connectionDB() {
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mysqldb1" , "root" , "test");
			Statement stmt = con.createStatement();
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
