package jbdc2.dynamicprogram;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;
import com.mysql.cj.jdbc.Driver;

public class InsertpProgram 
{
	public static void main(String[] args) throws Exception 
	{
		 Scanner sc=new Scanner(System.in);
		 int id=sc.nextInt();
		 System.out.println("ENTER THE ID");
		 
		 String name=sc.next();
		 System.out.println("ENTER THE NAME");
		 
		 String email=sc.next();
		 System.out.println("ENTER THE EMAIL");
		 
		 int phone=sc.nextInt();
		 System.out.println("ENTER THE PHONE");
		 
	    DriverManager.registerDriver(new Driver());
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc2?user=root&password=root");
		PreparedStatement ps=con.prepareStatement("insert into table1 values(?,?,?,?)");
		
		ps.setInt(1, id);
		ps.setString(2, name);
		ps.setString(3, email);
		ps.setInt(4, phone);
		
		if(ps.executeUpdate()>0)
		{
			System.out.println("installed succesfully");
		}
		ps.close();
		con.close();
		
		
	}	

}
