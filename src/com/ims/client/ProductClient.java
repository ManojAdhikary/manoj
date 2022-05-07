package com.ims.client;
//step 7 (last)
import java.util.Scanner;

import com.ims.dao.UserDAO;
import com.ims.dao.impl.UserDaoImpl;
import com.ims.details.ProductDetails;

public class ProductClient {

	public static void main(String[] args) {
		//1 TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//4
		UserDAO daoImpl = new UserDaoImpl();
		while (true) {
			//2
			System.out.println("****************************************");
			System.out.println("               1. Admin          ");
			System.out.println("               2. Register          ");
			System.out.println("               3. Product          ");
			System.out.println("               4. Exit           ");

			System.out.println("****************************************");

			System.out.println("Enter the choice ?");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter user Name: ");
				String uname = sc.next();
				System.out.println("Enter user Password: ");
				String pass = sc.next();
				if (uname.equalsIgnoreCase("admin") && pass.equals("admin")) {
					ProductDetails details = new ProductDetails();
					details.adminMenu();

				} else
					System.out.println("Invalid user");

				break;
			case 2:
				//3
				//5
				daoImpl.register();
				break;
			case 3:
				// to view the product consumer should be loging, if no thaving account register the account and login
				
				System.out.println("Enter email");
				String email = sc.next();
				System.out.println("Enter Password");
				String pasw = sc.next();
				boolean flag = daoImpl.verifyEmailAndPassword(email, pasw);
				if(flag) {
					ProductDetails detials = new ProductDetails();
					detials.productMenu();
				}else {
					System.out.println("Invalid username and password");
				}
				break;
			case 4:
				System.out.println("Thanks for using App!");
				System.exit(0);
				break;
			default:
				System.out.println("Choose 1 to 2 between");
			}
		} // end of while

	}

}
