package com.vodafone.ui;

 

import java.sql.DriverManager;
import java.sql.SQLException;

 

public class TestConnection {

 

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			DriverManager.getConnection("jdbc:mysql://localhost:3306/vodafonedb","root", "Admin@123");
			System.out.println("connected");
		} catch (ClassNotFoundException e) {
			System.out.println("driver class not found");
		} catch (SQLException e) {
			System.out.println("could not connect");
		}

 

	}

 

}