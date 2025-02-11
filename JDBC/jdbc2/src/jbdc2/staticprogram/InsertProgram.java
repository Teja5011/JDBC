package jbdc2.staticprogram;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class InsertProgram 
{
   public static void main(String[] args) throws ClassNotFoundException,SQLException 
   {
	  Class.forName("com.mysql.cj.jdbc.Driver");
	  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc2","root","root");
	  System.out.println(con);
	  Statement s=con.createStatement();
	  System.out.println(s);
	  System.out.println("Connection established successfully");
	  s.execute("insert into table1 values(1,'dinga','dinga@gmail.com',876543)");
	  s.close();
	  con.close();
	  System.out.println("inserted");
   }
}