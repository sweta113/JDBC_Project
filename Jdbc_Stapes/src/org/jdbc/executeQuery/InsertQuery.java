package org.jdbc.executeQuery;

import java.sql.*;

public class InsertQuery 
{
	public static void main(String[] args) 
	{
		Connection con=null;
		Statement stmt=null;
		
		String qry="insert into btm.student values(1,'Sweta',75.2)";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver class Load and Registered");
			
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
			System.out.println("Connection established with DB Server");
			
			stmt=con.createStatement();
			System.out.println("Platform created");
			
			stmt.executeUpdate(qry);
			System.out.println("Data inserted");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			if(con!=null)
			{
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(stmt!=null)
			{
				try {
					stmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("Close all costly resource ");
		}
		
		
	}

}
