package com.tnsif.JDBC;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Service {
	PreparedStatement pst;
	Statement st;
	Connection con;
	CallableStatement cs;
	
	public Service() throws SQLException {
		this.con = DBUtil.getConnectionObject();
		this.st = con.createStatement();
	}
	 public void storedProcedure() throws SQLException
		{
			String query="CREATE PROCEDURE p9() BEGIN insert into student(USN,SNAME,ADDRESS,PHONE,GENDER) VALUES ('1SR08CS066','KARAN','GULBARGA',565668,'M');\r\n"
					+ "insert into student(USN,SNAME,ADDRESS,PHONE,GENDER) VALUES ('1SR98CS077','JOHN','GULBARGA',565668,'M');\r\n"
					+ "insert into student(USN,SNAME,ADDRESS,PHONE,GENDER) VALUES ('1SR98CS088','VAN','GULBARGA',565668,'M');\r\n"
					+ "END";
			cs=con.prepareCall(query);
			boolean b=st.execute(query);
			String query1=" call p1()";
			boolean b1=st.execute(query1);
			System.out.println(b);
		}

	public void getStudents() throws SQLException {
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

	public void getStudent() throws SQLException {
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

	public void deleteStudent() throws SQLException {
		String SQLDELETE = "DELETE FROM STUDENT WHERE USN='1SK18CS005'";
		Integer executeUpdate = st.executeUpdate(SQLDELETE);
		if(executeUpdate==1) {
			System.out.println("Student is deleted.");
		}
	}

	public void updateStudent() throws SQLException {
		String SQLUPDATE = "UPDATE STUDENT SET SNAME = 'VARUN' WHERE USN='1SR98CS006'";
		Integer executeUpdate = st.executeUpdate(SQLUPDATE);
		if(executeUpdate==1) {
			System.out.println("Student is updated.");
		}
	}

	public void createStudent() throws SQLException {
		String SQLINSERT = "INSERT INTO STUDENT (USN,SNAME,ADDRESS,PHONE,GENDER) VALUES ('1SR98CS011','KIRAN','GULBARGA',565668,'M')";
	    Integer executeUpdate = st.executeUpdate(SQLINSERT);
	    if (executeUpdate==1) {
	    	System.out.println("Student is added.");
	    }
	}	
}
