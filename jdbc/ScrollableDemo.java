package com.quinnox.jdbc;
import java.sql.*;

public class ScrollableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 Connection con;
		 Statement stmt;
		 ResultSet rs;
		 try {
			 Class.forName("oracle.jdbc.driver.OracleDriver");
			 System.out.println("Connecting to database.....");
con=DriverManager.getConnection ("jdbc:oracle:thin:@localhost:1521:XE","hr","hr");
stmt=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
rs=stmt.executeQuery("select * from departments");
rs.afterLast();
while(rs.previous())
{
	System.out.println(rs.getInt(1)+ " " +rs.getString(2));
}
	System.out.println("*************************************");
	rs.absolute(10);
	System.out.println(rs.getInt(1)+"  "+rs.getString(2));
	System.out.println("*************************************");
	
rs.relative(-1);
System.out.println(rs.getInt(1)+"  "+rs.getString(2));
System.out.println("*************************************");
int i = rs.getRow();
System.out.println("cursor position = "+i);
rs.close();
stmt.close();
con.close();
}
		 catch(Exception e)
		 {
			 System.out.println(e);
		 
		 }
	}

}
