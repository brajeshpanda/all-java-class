package com.registration.model;

public interface DAOService {
	public boolean verifyCredentials(String email, String password);
	
	public void saveRegistration(String name, String city, String email, String mobile);
	
	public void connectionDB();

}
