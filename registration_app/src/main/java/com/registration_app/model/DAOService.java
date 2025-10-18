package com.registration_app.model;

import java.sql.ResultSet;

public interface DAOService {
	
	public boolean verifyCredentials(String email , String password);
	
	public void saveRegistration(String name, String city , String email , String mobile);
	
	public void connectionDB();

	public ResultSet getAllReg();

	void deleteByEmail(String email);

	public void updateReg(String email, String mobile);
	

}
