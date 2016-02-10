package com.example.classs;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.example.utils.SqlConnection;

public class Customer {
	
	private Connection con=null;
	
	
	
  private int customerId;
  private  String customerName;
  private String email_id;
  private long handPhone;
    
  public Customer() {
   super();
   con=SqlConnection.getOracleConnection();
   
   // TODO Auto-generated constructor stub
  }
 
  public Customer(int customerId, String customerName, String email_id, long handPhone) {
        //declare rule  
    	super();
           this.customerId = customerId;
           this.customerName = customerName;
           this.email_id = email_id;
          
           this.handPhone = handPhone;
    }
    public int getCustomerId() {
           return customerId;
    }
    public void setCustomerId(int customerId) {
           this.customerId = customerId;
    }
    public String getCustomerName() {
           return customerName;
    }
    public void setCustomerName(String customerName) {
           this.customerName = customerName;
    }
    public String getEmail_id() {
           return email_id;
    }
    public void setEmail_id(String email_id) {
           this.email_id = email_id;
    }
    public long getHandPhone() {
           return handPhone;
    }
    public void setHandPhone(long handPhone) {
          
           this.handPhone = handPhone;
         
    }
    public String showCustomer()
    
    {
String cust =customerId +":"+ customerName + ":" + email_id + ":" + handPhone;
return cust;
    }
    
    
}

