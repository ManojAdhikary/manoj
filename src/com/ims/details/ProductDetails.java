package com.ims.details;
//step 4

import java.util.List;
import java.util.Scanner;

import com.ims.client.ProductClient;
import com.ims.dao.ProductDAO;
import com.ims.dao.impl.ProductDAOImpl;
import com.ims.model.Product;

public class ProductDetails {
	// 3
	Scanner sc = new Scanner(System.in);
	// 4
	ProductDAO daoImpl = new ProductDAOImpl();

	public void adminMenu() {
		// 2
		while (true) {
			// 1
			System.out.println("****************************************");
			System.out.println("               1. Add Product           ");
			System.out.println("               2. View All Products     ");
			System.out.println("               3. View  Product      ");
			System.out.println("               4. Back                  ");

			System.out.println("****************************************");

			// 4
			System.out.println("Enter the choice ?");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				daoImpl.addProducts();
				break;
			case 2:
				// control 1
				List<Product> viewAllProducts = daoImpl.viewAllProducts();
				// 6
				if (viewAllProducts.size() != 0) {
					// 5
					for (Product pro : viewAllProducts) {
						System.out.println(
								pro.getPid() + "\t" + pro.getPname() + "\t" + pro.getPrice() + "\t" + pro.getQty());

					}
				} else {
					System.out.println("Stock is empty");
				}
				break;

			case 3:
				System.out.println("Enter product Number: ");
				Product pro = daoImpl.viewProduct((sc.nextInt()));
				if (pro != null) {
					System.out.println(
							pro.getPid() + "\t" + pro.getPname() + "\t" + pro.getPrice() + "\t" + pro.getQty());

				} else
					System.out.println("Product is not exist");
				break;

			case 4:
				ProductClient.main(null);
				break;
			default:
				System.out.println("choose 1 to 4 between");

			}// Switch case
		} // end of while loop

	}// end of product menu Method
	public void productMenu() {
		// 2
		while (true) {
			// 1
			System.out.println("****************************************");
			System.out.println("               1. View All Products     ");
			System.out.println("               2. View  Product      ");
			System.out.println("               3. Back                  ");

			System.out.println("****************************************");

			// 4
			System.out.println("Enter the choice ?");
			int choice = sc.nextInt();
			switch (choice) {

			case 1:
				// control 1
				List<Product> viewAllProducts = daoImpl.viewAllProducts();
				// 6
				if (viewAllProducts.size() != 0) {
					// 5
					for (Product pro : viewAllProducts) {
						System.out.println(
								pro.getPid() + "\t" + pro.getPname() + "\t" + pro.getPrice() + "\t" + pro.getQty());

					}
				} else {
					System.out.println("Stock is empty");
				}
				break;

			case 2:
				System.out.println("Enter product Number: ");
				Product pro = daoImpl.viewProduct((sc.nextInt()));
				if (pro != null) {
					System.out.println(
							pro.getPid() + "\t" + pro.getPname() + "\t" + pro.getPrice() + "\t" + pro.getQty());

				} else
					System.out.println("Product is not exist");
				break;

			case 3:
				ProductClient.main(null);
				break;
			default:
				System.out.println("choose 1 to 4 between");

			}// Switch case
		} // end of while loop

	}// end of product menu Method

}
