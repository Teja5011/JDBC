package jbdc2.staticprogram;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/*
 * execute
 */

public class FetchProgram 
{
	public static void main(String[] args) throws Exception 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc2?user=root&password=root");
		System.out.println(con);
		Statement s=con.createStatement();
		ResultSet res=s.executeQuery("select * from table1");
		
		while(res.next())
		{
			int id=res.getInt(1);
			String name=res.getString(2);
			long phn=res.getLong(3);
			String email=res.getString(4);
			System.out.println(id+""+name+""+email+""+phn);
			
		}
		
		
		
		
		
		
		
		System.out.println(res);
		s.close();
		con.close();
		System.out.println("fetched");
		
		
	}

}
