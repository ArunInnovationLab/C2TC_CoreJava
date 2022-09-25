package com.tnsif.JDBC;

import java.sql.SQLException;

public class Client {

	public static void main(String[] args) throws SQLException {
		Service s1 = new Service();
		
		s1.createStudent();
		s1.updateStudent();
		s1.deleteStudent();
		s1.getStudent();
		s1.getStudents();
		s1.storedProcedure();
	}
	
}

