package com.quinnox.jdbc;
import java.sql.*;
public class InsertDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection con ;
		Statement stmt;
		ResultSet rs;
		int cnt=0;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection ("jdbc:oracle:thin:@localhost:1521:XE","hr","hr");
			String str= "insert into departments values(420, 'sports',201,2500)";
					stmt = con.createStatement();
					int rowcount = stmt.executeUpdate(str);
					if(rowcount > 0)
					{
						System.out.println("Record Inserted Successfully");
					}
					String str1 = "select count(department_id) from departments";
					rs=stmt.executeQuery(str1);
				while(rs.next()) {
					cnt=rs.getInt(1);
					
				}
				System.out.println("Total no of records is :"+cnt);
				con.close();
				
					
			
		}
		catch(Exception ce) {
			System.out.println(ce);
		}
		
		
		
	}

}
