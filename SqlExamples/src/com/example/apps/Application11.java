package com.example.apps;



import java.util.List;

import com.example.classs.Customer;
import com.example.classs.CustomerDao;

public class Application11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Customer cust = new Customer(2081, "shyam", "rshyam@gmail.com", 12212);
		Customer cust1 = new Customer(207, "vikash", "vikaaa@gmail.com", 121567212);
		Customer cust2 = new Customer(2087, "Ramit", "ramit@gmail.com", 34222212);
		CustomerDao dao = new CustomerDao();
		//int rowAdded = dao.add(cust) + dao.add(cust1)	+ dao.add(cust2);


		
		//System.out.println(rowAdded +"rows added");
		
		
		
		
	//Customer cust12 =	dao.find(101);
	
	
	//System.out.println(cust12.showCustomer());
	
	List<Customer> customers  = dao.findAll();
	for(Customer custom:customers)
	{
		// System.out.println(custom.showCustomer());
	}
	
	//int custdelete =	dao.delete(101);
	//System.out.println(custdelete+ " rows deleted\n");
//	List<Customer> customers1  = dao.findAll();
//	for(Customer custom:customers1)
//	{
//		System.out.println(custom.showCustomer());
//	}
//	
	int custUpdate =	dao.update(103);
	System.out.println(custUpdate+ " rows Updated\n\n");
	
	
	List<Customer> customers2  = dao.findAll();
	for(Customer custom:customers2)
	{
		System.out.println(custom.showCustomer());
	}
	
	}

}
