package com.ims.model;
//step 1
public class Product {
	// Encapsulation
	// access modifier
	private int pid;
	private String pname;
	private int qty;
	private double price;

	// why both parameterized and default constructor: Once we write parameterized
	// constructor JVM will not generate
	// default constructor , so that better to create default constructor along with
	// parameterized constructor

//parameterized constructor: object creation time
	public Product(int pid, String pname, int qty, double price) {
		// this keyword - local variables and non static variables if its same to
		// differentiate from local variables we can use this keyword
		// Do not use inside the static method
		this.pid = pid;
		this.pname = pname;
		this.qty = qty;
		this.price = price;
	}

// default constructor : Name of constructor should be same as class name
	public Product() {
		super();
	}

//setter and getter
// setxxx() set the value inside the object
// getxxx()- ge the value from the object
// when i use my project 
//setxxx() better use: to modify / update object 

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
