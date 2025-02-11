package jdbc1;

import java.sql.DriverManager;
import java.sql.SQLException;
import com.mysql.cj.jdbc.Driver;

public class Step1 
{
	public static void main(String[] args) throws ClassNotFoundException,SQLException
	{
//      TWO TYPES TO ACHIVE DRIVER METHODS:
//	    1) forName()
//	    2) registerDriver()
		
//		TO DOWNLOAD MYSQL REPOSTIRTY
//		MAVEN RESPORITY: SEARCH -> MYSQL->MYSQL CONNECTOR JAVA(8.0.28)->FILES->JAR
		
//		HOW TO CONNECT MYSQL REPOSTIRTY
//		PROJECT-> BUILD PATH -> CONGIURE BUILD PATH->LIBARIES->CLASS PATH->ADD EXTENAL JARS->ADD JAR AND ADD AND APPLY.
		
//	    STEP-1:LOAD AND REGISTER
//		USING forname()
		Class.forName("com.mysql.cj.jdbc.Driver");
		Driver driver1=new com.mysql.jdbc.Driver();
		
//		USING registerDriver()
		Driver driver=new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(driver);
		System.out.println("loaded");
		
	}

}
