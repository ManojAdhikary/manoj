package com.ims.dao;

//step2
import java.util.List;

import com.ims.model.Product;

//interface: contract between provider and consumer/client. using interface keyword create  structure, 
//by default interface method are abstract methods, by default interface variables are  constant  
// interface can extends more than one interface
// class can implements more than one interface
//interface methods should be implement subclass if not implement subclass declared as abstract class
//Java 8 features:
// i)Interface inside we can define static methods
// ii) Interface inside we can specify default methods eg. default void funx(){}
// inside interface we can define class
// NOTE: interface object we can create using annomous block/class
public interface ProductDAO {
	void addProducts();

	List<Product> viewAllProducts();

	Product viewProduct(int pno);

	// LIST: list interface can hold group of object, it allows duplicate object
	// it can hold heterogeneous object
	// list extends collection interface
	// list interface having implementations classes like ArrayList, vector,
	// LinkedList

}
//Arraylist:
//can hold group of obj
//each and every obj will be stored index value (insertion order is preserved)
// it allows duplicate element
// DS is growable "array"
// null insertion is possible
// heterogenous objects(different types of obj like string, integer, double
// Non synchronized methods
//use Retrieval operations
//NOTE Arraylist and vector implements randomacesss interface

//NON-synchronized: 
//It allows more than one request at a time... 
//so that waiting time will be less

//synchronized:
// It allowes one request at a time waiting time will be more, sensative operations
