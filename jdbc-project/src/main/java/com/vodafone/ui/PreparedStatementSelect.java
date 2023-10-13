package com.vodafone.ui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PreparedStatementSelect {
public static void main(String[]args) {
	    
		try {
			Class.forName("com.mysql.cj.jdbc.Driver") ;
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vodafonedb", "root", "Admin@123");
			
			String sql = "SELECT empno,ename,salary FROM employees";
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getDouble(3));     	
			}
			
			}catch (ClassNotFoundException e) {
				System.out.println("driver class not found");

				 

			} catch (SQLException e) {
				System.out. println("could not connect");
				}
			finally {
				System.out.println("exception handling done");
		}

}
}
