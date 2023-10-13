package com.vodafone.ui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class PreparedStatementDelete {
	public static void main(String[]args) {
	    
		try {
			Class.forName("com.mysql.cj.jdbc.Driver") ;
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vodafonedb", "root", "Admin@123");
			
			Scanner scan= new Scanner(System.in);
			System.out.println("Enter employee :");
			int employeeNumber=scan.nextInt();
			
			String sql = "DELETE FROM employees WHERE empo = " +employeeNumber ;
			PreparedStatement pst = con.prepareStatement(sql);
			
			int rowsInserted = pst.executeUpdate ();
			if (rowsInserted == 1)
				System.out.println("employee added");

			else
				System.out.println("Deletion error");
			
			scan.close();
		} catch (ClassNotFoundException e) {
			System.out.println("driver class not found");

			 

		} catch (SQLException e) {
			System.out. println("could not connect");
			}
		finally {
			System.out.println("exception handling done");
	}
	}

}
