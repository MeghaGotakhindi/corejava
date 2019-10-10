package com.quinnox.jdbc;
import java.sql.*;
import java.util.Scanner;


public class deleteDemo {
	
	
public static void main(String[] args) {
		// TODO Auto-generated method stub

	Connection con;
    
    Statement stmt;
    Statement pstmt;
	ResultSet rs;
	int cnt=0;
	try {
		
	
	Class.forName("oracle.jdbc.driver.OracleDriver");
	con=DriverManager.getConnection ("jdbc:oracle:thin:@localhost:1521:XE","hr","hr");
	
	String sql= "Delete from employees where last_name like \'B%\'";
	System.out.println(" ");
	stmt = con.createStatement();
	cnt = stmt.executeUpdate(sql);
	 if (cnt>0)
		 System.out.println("Record for young is deleted");
	 con.close();
	 
	}
	catch(Exception ce)
	{
		System.out.println(ce);
	}

}
}
