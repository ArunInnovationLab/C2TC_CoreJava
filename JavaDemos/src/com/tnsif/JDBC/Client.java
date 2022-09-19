package com.tnsif.JDBC;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Client {

	public static void main(String[] args) throws SQLException {
		createStudent();
		updateStudent();
		deleteStudent();
		getStudent();
		getStudents();
	}

	private static void getStudents() throws SQLException {
		Connection conn = DBUtil.getConnection();
		Statement st = conn.createStatement();
		String SQL = "SELECT * FROM STUDENT";
		ResultSet rs = st.executeQuery(SQL);
		while(rs.next()) {
			String usn = rs.getString("USN");
			String name = rs.getString("SNAME");
			String address = rs.getString("ADDRESS");
			Integer phone = rs.getInt("PHONE");
			String gender = rs.getString("GENDER");
			
			System.out.println(usn+"\t"+name+"\t"+address+"\t"+phone+"\t"+gender);
			
		}
		
	}

	private static void getStudent() throws SQLException {
		Connection conn = DBUtil.getConnection();
		Statement st = conn.createStatement();
		String SQL = "SELECT * FROM STUDENT WHERE SNAME = 'ARUNKUMAR'";
		ResultSet rs = st.executeQuery(SQL);
		if(rs.next()) {
			String usn = rs.getString("USN");
			String name = rs.getString("SNAME");
			String address = rs.getString("ADDRESS");
			Integer phone = rs.getInt("PHONE");
			String gender = rs.getString("GENDER");
			
			System.out.println(usn+"\t"+name+"\t"+address+"\t"+phone+"\t"+gender);
			
		}else {
			System.out.println("Student does not exist");
		}

	}

	private static void deleteStudent() throws SQLException {
		Connection conn = DBUtil.getConnection();
		Statement st = conn.createStatement();
		String SQLDELETE = "DELETE FROM STUDENT WHERE USN='1SK18CS005'";
		Integer executeUpdate = st.executeUpdate(SQLDELETE);
		if(executeUpdate==1) {
			System.out.println("Student is deleted.");
		}
	}

	private static void updateStudent() throws SQLException {
		Connection conn = DBUtil.getConnection();
		Statement st = conn.createStatement();
		String SQLUPDATE = "UPDATE STUDENT SET SNAME = 'VARUN' WHERE USN='1SR98CS006'";
		Integer executeUpdate = st.executeUpdate(SQLUPDATE);
		if(executeUpdate==1) {
			System.out.println("Student is updated.");
		}
	}

	private static void createStudent() throws SQLException {
		Connection conn = DBUtil.getConnection();
		Statement st = conn.createStatement();
		String SQLINSERT = "INSERT INTO STUDENT (USN,SNAME,ADDRESS,PHONE,GENDER) VALUES ('1SR98CS010','KIRAN','GULBARGA',565668,'M')";
	    Integer executeUpdate = st.executeUpdate(SQLINSERT);
	    if (executeUpdate==1) {
	    	System.out.println("Student is added.");
	    }
	}	
	
	
}
