package com.ims.dao;
//step 5 (part 1)

public interface UserDAO {
	void register();
	boolean verifyEmailAndPassword(String email, String pass);
	
	

}
