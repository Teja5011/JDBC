package jbdc2.dynamicprogram;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;
import com.mysql.cj.jdbc.Driver;


public class DeleteProgram 
{
	public static void main(String[] args) throws Exception 
	{
		 Scanner sc=new Scanner(System.in);
		
		 System.out.println("ENTER THE EMAIL");
		 String email=sc.next();
		 
		 System.out.println("ENTER THE PHONE");
		 int phone=sc.nextInt();
				 
	    DriverManager.registerDriver(new Driver());
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc2?user=root&password=root");
		PreparedStatement ps=con.prepareStatement("delete from table1 where email=? and phone=?");
		
		ps.setString(1, email);
		ps.setLong(2, phone);
		
		
		if(ps.executeUpdate()>0)
		{
			System.out.println("deleted succesfully"+email);
		}
		ps.close();
		con.close();
		
		
	}

}
