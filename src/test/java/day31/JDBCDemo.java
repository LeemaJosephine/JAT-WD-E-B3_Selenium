package day31;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Step 1: Database connection details
		
		String db_url="jdbc:mysql://localhost:3306";
		String user ="root";
		String password="root";
		
		// Step 2: Establish the connection.
		
			try {
				Connection connection = DriverManager.getConnection(db_url, user, password);
				
		// Step 3: Check connection is successful
				
				if(connection!=null) {
					System.out.println("Connection established");
				} else {
					System.out.println("Issue in connecting");
				}
				
		//Step 4: Peform Operation
				
				// Create the statements
				
				String createDB=" CREATE DATABASE JDBC_DEMO";
				String use="USE JDBC_DEMO";
				String createTable=" CREATE TABLE DEMO_TABLE (RNO INT, NAME VARCHAR(15),AGE INT)";
				String insert="INSERT INTO DEMO_TABLE VALUES(101,'Leema',25),(102,'Arun',24)";
				String select = "SELECT * FROM DEMO_TABLE";
				
				Statement stmt = connection.createStatement();
				
				// Execute the statements
				
				stmt.execute(createDB);
				
				stmt.execute(use);
				
				stmt.execute(createTable);
				
				stmt.executeUpdate(insert);
				
				ResultSet res = stmt.executeQuery(select);
				
				while(res.next()) {
					
					System.out.println(res.getInt("rno")+" "+ res.getString("name")+" "+ res.getInt("age"));
				}
				
			// Step 5: Close the connection
				
				connection.close();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}
