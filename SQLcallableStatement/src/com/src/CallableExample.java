package com.src;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class CallableExample {

	
	public static void main(String[] args) {
		try{
			
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:system/system@localhost:1521:XE";
			Connection con=DriverManager.getConnection(url);
			CallableStatement stmt = con.prepareCall("call UPDATEHANDPHONE(?,?)");
			stmt.setInt(1, 108);
			stmt.setLong(2, 8797767383L);
			
			stmt.execute();
			
			
			System.out.println("Phone number Updated");
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
		
	}
}
