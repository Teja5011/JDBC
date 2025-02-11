package jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class EmpFetch 
{
	public static void main(String[] args) throws Exception 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc2?user=root&password=root");
		System.out.println(con);
		Statement s=con.createStatement();
		ResultSet res=s.executeQuery("select * from emp where job='software' and sal>49578");
		while(res.next())
		{
			String job=res.getNString(1);
			long sal=res.getLong(1);
			System.out.println(job+""+sal);
		}
		s.close();
		con.close();	
	}
}
