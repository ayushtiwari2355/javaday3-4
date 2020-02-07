package com.sapient.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcInsertDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       try{
    	   Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/qe_users","root","welcome");
    			   Statement statement= (Statement) connection.createStatement();
    	           statement.execute("insert into users (name, dept, email) values('ayush', 'HR', 'eshutiwaertri235ew0ty935')");
                   ResultSet resultset= statement.executeQuery("select * from users");
                  // boolean flag= true;
                   while(resultset.next()){
                	  // flag=resultset.next();
                	   int empId=resultset.getInt("id");
                	   String empName= resultset.getString("name");
                	   String empdept= resultset.getString("dept");
                	   String empEmail= resultset.getString("email");
                	   System.out.println(empName+" "+empdept+" "+empEmail);

                   }
    	           statement.close();
                   connection.close();
       }
       
       catch(SQLException e){
    	   e.printStackTrace();
       }
	}

}
