package com.vodafone.ui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class StatementUpdate {
	public static void main(String[]args) {
	    
		try {
			Class.forName("com.mysql.cj.jdbc.Driver") ;
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vodafonedb", "root", "Admin@123");
			
			Scanner scan= new Scanner(System.in);
			System.out.println("Enter employee :");
			int employeeNumber=scan.nextInt();
			
			System.out.println("Enter new salary");
			double newsalary=scan.nextDouble();
			
			String sql = "UPDATE employees SET salary = "+"WHERE empo = " +employeeNumber ;
			Statement st = con. createStatement ();
			int rowsInserted = st.executeUpdate (sql);
			if (rowsInserted == 1)
				System.out.println("employee added");

			else
				System.out.println("Updation error");
			
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
	
