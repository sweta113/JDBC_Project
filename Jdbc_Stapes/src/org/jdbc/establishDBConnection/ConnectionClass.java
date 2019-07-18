package org.jdbc.establishDBConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionClass
{
	public static void main(String[] args) 
	{
		Connection con=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver class Load and Registerd");
			
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
			System.out.println("Connection established with data base server");
		
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
			System.out.println("Closed costly Resource");
		}
		
	}

}
