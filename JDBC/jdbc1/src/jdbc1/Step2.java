package jdbc1;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Step2 
{
	public static void main(String[] args) throws IOException
	{
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/";
			String user="root";
			String pwd="root";
//			DriverManager.getConnection(url, user, pwd);
			
//			k1=v1& k2=v2 key and value (SINGLE ARGUMENT)
//			DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc2?user=root&password=root");	
			
//			1.create a file in the project
//			2. ________.properties	
/*			
			user=root;
			password=root;
*/
			FileInputStream stream=new FileInputStream("db.properties");
			Properties p=new Properties();
			p.load(stream);
			DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc2",p);	
			
			
			
			System.out.println("sucessfully loaded");
		} 
		catch (ClassNotFoundException|SQLException e) 
		{
			e.printStackTrace();
		}
	}
}
