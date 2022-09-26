package com.tnsif.JDBC;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Service {
	
	Statement st;
	Connection conn;
	PreparedStatement pst;
	CallableStatement cs;
	
	
	public Service() throws SQLException {
		this.conn = DBUtil.getConnectionObject();
		this.st = conn.createStatement();
	}
	
	public void createStoredProcedure() throws SQLException {
		String proc = "CREATE PROCEDURE `new_procedure1` ()\r\n" + 
				"BEGIN\r\n" + 
				"INSERT INTO STUDENT(ID,NAME,GENDER) VALUES (5,'JAMES','M');\r\n" + 
				"INSERT INTO STUDENT(ID,NAME,GENDER) VALUES (6,'JOHN','M');		\r\n" + 
				"END";
		
		boolean r = st.execute(proc);
		System.out.println("Stored procedure created .");
		System.out.println(r);
				
	}
	
	public void callStoredProcedure() throws SQLException {
		String call = "{call new_procedure1()}";
		
		cs = conn.prepareCall(call);
		int  r = cs.executeUpdate();
		System.out.println("Stored procedure executed .");
		System.out.println(r);
		
		
	}
	
	public void cerateTable() throws SQLException {
		String query = "CREATE TABLE STUDENT (ID INT PRIMARY KEY,NAME VARCHAR(20),GENDER VARCHAR(1))";
		boolean r = st.execute(query);
		System.out.println("Table created .");
		System.out.println(r);
		
	}
	
	public void insertStudent() throws SQLException {
        String query = "INSERT INTO STUDENT VALUES(2,'VARUN','M')";
		int r = st.executeUpdate(query);
		System.out.println("Data inserted .");
		System.out.println(r);	
	}
	
	public void updateStudent() throws SQLException {
		String query = "UPDATE STUDENT SET NAME = 'ARUNKUMAR' WHERE NAME = 'ARUN'";
		int r = st.executeUpdate(query);
		System.out.println("Table updated .");
		System.out.println(r);
	}
	
	public void deleteStudent() throws SQLException {
		String query = "DELETE FROM STUDENT WHERE ID = 2";
		st.executeUpdate(query);
		System.out.println("Row deleted .");
	}
	
	public void getStudent() throws SQLException {
		String query = "SELECT * FROM STUDENT WHERE ID = 1";
		ResultSet rs = st.executeQuery(query);
		if(rs.next()) {
			System.out.println(rs.getInt("ID")+"\t"+rs.getString("Name")+"\t"+rs.getString("Gender"));
		}else {
			System.out.println("Student doesn't exist .");
		}
	}
	
	public void getStudents() throws SQLException {
		String query = "SELECT * FROM STUDENT";
		ResultSet rs = st.executeQuery(query);
		while(rs.next()) {
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
		}
	}
	
	public void preparedUpdate() throws SQLException {
		String query = "UPDATE STUDENT SET NAME = ? WHERE ID = ?";
		pst = conn.prepareStatement(query);
		
		String name = "ARUN"; //set 
		int id = 1; //where
		
		pst.setString(1, name);
		pst.setInt(2, id);
		
		int rowsAffected = pst.executeUpdate();
		System.out.println(rowsAffected+" row affected .");
		
		name = "VARUN"; //set 
		id = 2; //where
		
		pst.setString(1, name);
		pst.setInt(2, id);
		
		rowsAffected = pst.executeUpdate();
		System.out.println(rowsAffected+" row affected .");		

	}

}
