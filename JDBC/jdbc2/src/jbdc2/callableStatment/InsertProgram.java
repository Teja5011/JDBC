package jbdc2.callableStatment;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertProgram 
{
	public static void main(String[] args) throws Exception,SQLException
	{
		Scanner sc=new Scanner(System.in);
		  Class.forName("com.mysql.cj.jdbc.Driver");
		  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc2?user=root&password=root");
		  CallableStatement cs=con.prepareCall("call jdbc2.insert(?,?,?,?)");
		  System.out.println("enter id");
		  cs.setInt(1,sc.nextInt());
		  System.out.println("enter name");
		  cs.setString(2,sc.next());
		  System.out.println("enter phno");
		  cs.setLong(3,sc.nextLong());
		  System.out.println("enter email");
		  cs.setString(4,sc.next());
		  
		  if(cs.executeUpdate()>0)
		  {
			  System.out.println("operation successful");
		  }
		  else
		  {
			  System.out.println("failed ");
		  }
		  cs.close();
		  con.close();
	}
		

}
