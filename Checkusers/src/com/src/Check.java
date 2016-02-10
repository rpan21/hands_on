package com.src;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Check {
	Connection con=null;
public void check(String key1,String key2)	
{
		
		try
		{
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url="jdbc:oracle:thin:system/system@localhost:1521:XE";
			
			con = DriverManager.getConnection(url);
			 String sql = "select * from checkusers where username = ? and password=?";
			 PreparedStatement stmt= con.prepareStatement(sql);
			 stmt.setString(1, key1);
			 stmt.setString(2, key2);
			 
			 ResultSet rs =stmt.executeQuery();
				
				if(rs.next()){
					
					System.out.println("Welcome " +rs.getString(1)+" . your role is "+rs.getString(3)+" of Sapient");
					
				}
				else
				System.out.println("sorry wrong credentials");
				
					
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}


		
	}
}
