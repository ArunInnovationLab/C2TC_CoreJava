package com.tnsif.JDBC;

import java.sql.SQLException;


public class Client {

	public static void main(String[] args) throws SQLException  {

		Service s = new Service();
		s.getStudents();
		//s.cerateTable();
		//s.insertStudent();
		//s.updateStudent();
		//s.deleteStudent();
		//s.getStudent();
		//s.preparedUpdate();
	    //s.createStoredProcedure();
		//s.callStoredProcedure();
	}

}
