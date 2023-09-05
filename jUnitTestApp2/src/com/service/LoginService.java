package com.service;

public class LoginService {
	public boolean checkUser (String emailid, String password) {
		if(emailid.equals("akash@gmail.com") && password.equals("123")) {
			return true;
		}else {
			return false;
		}
	}

}
