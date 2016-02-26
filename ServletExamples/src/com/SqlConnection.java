package com;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class SqlConnection {

	public static Connection getOracleConnection() {
		
		Connection con = null;
		
		try {
		
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url="jdbc:oracle:thin:system/system@localhost:1521:XE";
			
			con = DriverManager.getConnection(url);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return con;
	} 
}
