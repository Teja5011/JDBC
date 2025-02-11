package jbdc2.callableStatment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.CallableStatement;
import java.util.Scanner;

public class DeleteProgram 
{
	public static void main(String[] args) throws Exception 
	{
		 Scanner sc=new Scanner(System.in);
		  Class.forName("com.mysql.cj.jdbc.Driver");
		  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc2?user=root&password=root");
		  CallableStatement cs=con.prepareCall("call jdbc2.delete(?, ?)");
		  System.out.println("enter id");
		  cs.setInt(1,sc.nextInt());
		  System.out.println("enter name");
		  cs.setString(2,sc.next());
		  
		  if(cs.executeUpdate()>0)
		  {
			  System.out.println("operatio  n successful");
		  }
		  else
		  {
			  System.out.println("failed ");
		  }
		  cs.close();
		  con.close();
	}
	

}
