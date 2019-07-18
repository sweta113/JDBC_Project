package org.jdbc.loadAndRegisterDriver;

public class LoadApp 
{
	public static void main(String[] args)
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver class Load and Registerd");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
