package com.cg.dbcrud;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.protocol.Resultset;

public class CrudSelect {

	public static void main(String[] args) {
		
		//to connect eclipse with MySQL server
		String dbURL="jdbc:mysql://127.0.0.1:3306/capgemini";
		String dbUsername="root";
		String dbPassword="Sakhare@9404";
		try 
		{
			Connection c = DriverManager.getConnection(dbURL,dbUsername ,dbPassword);
			//To retrieve a data
			String query="SELECT * FROM capgemini.employee;";
			Statement s=c.createStatement();
			ResultSet r=s.executeQuery(query);
			@SuppressWarnings("unused")
			int count=0;
			while(r.next())
			{
				int id = r.getInt(1);
				String name = r.getString(2);
				String email = r.getString(3);
				String password = r.getString(4);
				
				String output ="User :%d- %s %s %s";
				System.out.println(String.format(output, id,name,email,password));
				
			}
			
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
		
	}
}
