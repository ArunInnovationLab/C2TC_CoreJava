package com.tnsif.JDBC;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class DBUtil {
	
	private static final String DB_DRIVER_CLASS = "com.mysql.cj.jdbc.Driver"; 
	private static final String DB_USERNAME = "root";
	private static final String DB_PASSWORD = "ARUN1";
	private static final String DB_URL = "jdbc:mysql://localhost:3300/college";
	private static Connection connection = null;
	
	static {
		try {
			Class.forName(DB_DRIVER_CLASS);
			connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD); 
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection() {
		return connection;
	}

	public static Connection getConnectionObject() {
		// TODO Auto-generated method stub
		return connection;
	}
 	
}
