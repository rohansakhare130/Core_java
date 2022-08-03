package com.cg.dbcrud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CrudDBInsert {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		String dbDriver ="com.mysql.cj.jdbc.Driver";
		//to connect eclipse with MySQL server
		String dbURL="jdbc:mysql://127.0.0.1:3306/capgemini";
		String dbUsername="root";
		String dbPassword="Sakhare@9404";
		try 
		{
			Connection c = DriverManager.getConnection(dbURL,dbUsername ,dbPassword);
			String query="INSERT INTO EMPLOYEE (ID,NAME,EMAIL_ID,PASSOWERD)VALUES(?,?,?,?)";
			PreparedStatement p = c.prepareStatement(query);
			p.setInt(1, 123);
			p.setString(2, "ASHOK");
			p.setString(3, "ashok@gmail.com");
			p.setString(4, "ashok@123");
			int r=p.executeUpdate();
			//if row>0 means at -least some rows are there
			if(r>0)
			{
				System.out.println("A new user is inserted successfully");
				
			}
			c.close();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
		
	}

}
