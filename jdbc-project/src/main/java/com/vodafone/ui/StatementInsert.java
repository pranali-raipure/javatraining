package com.vodafone.ui;

import java. sql. Connection;
import java. sql. DriverManager; 
import java. sql.SQLException;
import java. sql. Statement;
public class StatementInsert {

	public static void main(String[] args) {
		try{
		Class.forName("com.mysql.cj.jdbc.Driver") ;
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vodafonedb", "root", "Admin@123");
		String sql = "INSERT INTO employees (empo, ename, salary) VALUES (495,'pranali', 35000.0)";
		Statement st = con. createStatement ();
		int rowsInserted = st.executeUpdate (sql);
		if (rowsInserted == 1)
			System.out.println("employee added");

 

		else
			System.out.println("insertion error");

 

		} catch (ClassNotFoundException e) {
			System.out.println("driver class not found");

 

		} catch (SQLException e) {
			System.out. println("could not connect");
		}
	}

 

}
