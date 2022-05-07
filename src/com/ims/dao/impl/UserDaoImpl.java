package com.ims.dao.impl;

import java.io.BufferedInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.ims.dao.UserDAO;
import com.ims.model.User;
//step 6 (part 1)

public class UserDaoImpl implements UserDAO {
//1
	Scanner sc = new Scanner(System.in);
//3
	// static can use all models
	static List<User> addUsers = new ArrayList<>();

	@Override
	public void register() {
		// 2 // TODO Auto-generated method stub
		System.out.println("Enter First name: ");
		String fname = sc.next();
		System.out.println("Enter Last name: ");
		String lname = sc.next();
		System.out.println("Enter email: ");
		String email = sc.next();
		System.out.println("Enter Mobile Number: ");
		long mn = sc.nextInt();
		System.out.println("Enter password: ");
		String pass = sc.next();
		User user = new User(fname, lname, email, mn, pass);

		// 4
		addUsers.add(user);
		System.out.println();
		System.out.println("Registered Successfully");

	}

	@Override
	public boolean verifyEmailAndPassword(String email, String pass) {
		// TODO Auto-generated method stub
		for(User user: addUsers) {
			if(user.getEmail().equals(email)&&user.getPassword().equals(pass)) {
				return true;
			}
		}
		return false;
	}

}
