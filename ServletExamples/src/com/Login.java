package com;

import java.sql.*;
import java.util.Scanner;

public class Login {

	public boolean isUser(String key1,String key2)	
	{
			Connection con = null;
			try
			{
				
				Class.forName("oracle.jdbc.driver.OracleDriver");
				String url="jdbc:oracle:thin:system/system@localhost:1521:XE";
				
				con = DriverManager.getConnection(url);
				 String sql = "select * from Employee where EmpName= ? and password = ?";
				 PreparedStatement stmt= con.prepareStatement(sql);
				 stmt.setString(1, key1);
				 stmt.setString(2, key2);
				 
				 ResultSet rs =stmt.executeQuery();
					
//				 if(rs.next())
//						System.out.println("Welcome " +rs.getString(2)+" . your role is "+rs.getString(3)+" of Sapient");
				 
				
					
					if(rs.next())
					{
				
					return true;
			        }
					else
					{
					
					return false;
					}
					
				
				
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			return false;


			
		}
	

}
