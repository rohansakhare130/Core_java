package com.cg.jdbc.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class DBConnect {

	public static void main(String[] args) throws SQLException 
	{
		String dbDriver ="com.mysql.cj.jdbc.Driver";
		//to connect eclipse with MySQL server
		String dbURL="jdbc:mysql://127.0.0.1:3306/capgemini";
		String dbUsername="root";
		String dbPassword="Sakhare@9404";
		String query="SELECT * FROM capgemini.student;";
		//if any exception will occur in driver class that will handle by using a catch block
		//if the class name of the drive is incorrect then it will throw an exception
		try
		{
			Class.forName(dbDriver);
			
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		try 
		{
			Connection c = DriverManager.getConnection(dbURL, dbUsername, dbPassword);
			Statement s= c.createStatement();
			ResultSet r= s.executeQuery(query);
		
			while(r.next())
			{
				String data ="";
				//column
				for(int i=1;i<=2;i++)
				{
					data=data+" "+r.getString(i);
						
				}
				System.out.println(data);
			
			}c.close();
		}
		catch(SQLException e)
		{
			System.out.println("Invalid URL/ID/PASSWORD");
			e.printStackTrace();
		}
		
	}
	
	  

}
