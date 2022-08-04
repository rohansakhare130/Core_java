package com.cg.dbcrud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CrudUpdate {

	public static void main(String[] args) {
		//to connect eclipse with MySQL server
		String dbURL="jdbc:mysql://127.0.0.1:3306/capgemini";
		String dbUsername="root";
		String dbPassword="Sakhare@9404";
				try 
				{
					Connection c = DriverManager.getConnection(dbURL,dbUsername ,dbPassword);
				String query="UPDATE EMPLOYEE SET NAME=?,EMAIL_ID=? WHERE ID =?";
					PreparedStatement p = c.prepareStatement(query);
					
					p.setString(1, "ROSHAN");
					p.setString(2, "roshan@gmail.com");
					//p.setString(3,"roshan@123");
					p.setInt(3, 122); 
					int r=p.executeUpdate();
					//if row>0 means at -least some rows are there
					if(r>0)
					{
						System.out.println("A new user is Updated successfully");
						
					}
					c.close();
				}
				catch(SQLException e)
				{
					e.printStackTrace();
				}
				
	}

}
