package com.ims.dao.impl;
//step 3
import java.util.ArrayList;
//step 3 
import java.util.List;
import java.util.Scanner;

import com.ims.dao.ProductDAO;
import com.ims.model.Product;

public class ProductDAOImpl implements ProductDAO {
//1	
	Scanner sc = new Scanner(System.in);

// 3subclass object obtain interface reference variable
static	List<Product> addProducts = new ArrayList<>();

	@Override
	public void addProducts() {
		// TODO Auto-generated method stub
		// 6
		int k = 1;
		while (k == 1) {
			// 2
			System.out.println("Enter Product Number: ");
			int pid = sc.nextInt();
			System.out.println("Enter Product Name: ");
			String pname = sc.next();
			System.out.println("Enter Product Quanty: ");
			int qty = sc.nextInt();
			System.out.println("Enter Product Price: ");
			int price = sc.nextInt();
//4
			Product product = new Product(pid, pname, qty, price);
			addProducts.add(product);
			System.out.println("Product Registred Successfully");
//5
			System.out.println("Do you want Add more record 1) Yes 2) NO");
			k = sc.nextInt();
		} // end of while

	}

	@Override
	public List<Product> viewAllProducts() {
		// TODO Auto-generated method stub
		// 7
		return addProducts;
	}

	@Override
	public Product viewProduct(int pno) {
		// TODO Auto-generated method stub
		// 8
		for (Product pro : addProducts) {
			if (pro.getPid() == pno)
				return pro;
		}
		return null;
	}

}
