package com.example.classs;




import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import com.example.utils.SqlConnection;
import com.example.classs.Customer;
import com.example.ifaces.DAO;
//import com.training.*;
public class CustomerDao implements DAO<Customer> {

	private Connection con;
	
	public CustomerDao() {
		super();
		// TODO Auto-generated constructor stub
		con = SqlConnection.getOracleConnection();
	}

	public CustomerDao(Connection con) {
		super();
		this.con = con;
	}
 
	@Override
	public int add(Customer t)
    {
    	int rowAdded=0;
  	  String sql="insert into customer values(?,?,?,?)";
  	  try {
		PreparedStatement pstmt= con.prepareStatement(sql);
		pstmt.setInt(1, t.getCustomerId());
		pstmt.setString(2, t.getCustomerName());
		pstmt.setLong(3, t.getHandPhone());
		pstmt.setString(4, t.getEmail_id());
		rowAdded=pstmt.executeUpdate();
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  	  return rowAdded;
    }
	
	

	@Override
	public Customer find(int key) {
		Customer cust = new Customer();
		String sql="Select * from customer where id=?";
		
		try {
			PreparedStatement pstmt= con.prepareStatement(sql);
			pstmt.setInt(1, key);
			ResultSet rs= pstmt.executeQuery();
			
				while(rs.next()) {
								
								cust.setCustomerId(rs.getInt("id"));
								cust.setCustomerName(rs.getString("cus_Name"));
								cust.setEmail_id(rs.getString("email_id"));
								cust.setHandPhone(rs.getLong("hand_Phone"));
							} 

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return cust;
	} 
	private Customer getCustomer(ResultSet rs) throws SQLException
	{
		Customer cust = null;
	    int custId = rs.getInt("id");	
		String customerName = rs.getString("cus_name");
		String email_id =    rs.getString("email_id");
		long handPhone =  rs.getLong("hand_Phone");
			
	cust = new Customer(custId,customerName,email_id,handPhone);
		       
	return cust;
	}
	@Override
	public List<Customer> findAll() {
	       List<Customer> custList=new ArrayList<Customer>();
			
	        try {
				
				String sql="select * from CUSTOMER ";
				
				PreparedStatement pstmt= con.prepareStatement(sql);
				
							
				ResultSet rs =pstmt.executeQuery();
				
				while(rs.next()){
					
					Customer cust = getCustomer(rs);
					
					 custList.add(cust);
				}
				
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			
			return custList;
			
		}

	@Override
	public int update(int key) {
		int rowUpdate=0;
		String name="akash";
		Customer cust = new Customer();
		String sql=" update customer set cus_name = ? where id=?" ;
		try {
			PreparedStatement pstmt= con.prepareStatement(sql);
			pstmt.setInt(2, key);
			pstmt.setString(1, name);
			rowUpdate = pstmt.executeUpdate();
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		
		return rowUpdate;
	}

	@Override
	public int delete(int key) {
		int rowDelete=0;
		Customer cust = new Customer();
		String sql=" delete from customer where id=?";
		try {
			PreparedStatement pstmt= con.prepareStatement(sql);
			pstmt.setInt(1, key);
			rowDelete = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rowDelete;
	}

} 
