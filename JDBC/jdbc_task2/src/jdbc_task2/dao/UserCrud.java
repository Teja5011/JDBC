package jdbc_task2.dao;

import java.util.Scanner;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import com.mysql.cj.jdbc.Driver;

import jdbc_task2.dto.User;

import java.sql.PreparedStatement;


/*
* 	dao===>data accesss object
* 	dao--->used to db logic
*/
public class UserCrud
{
	public Connection createTable() throws Exception
	{
		DriverManager.registerDriver(new Driver());
		FileInputStream stream=new FileInputStream("user.Properties");
		Properties p=new Properties();
		p.load(stream);
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/user_jdbc_db?CreateDatabaseIfNotExist=true",p);
		Statement s=con.createStatement();
		s.execute("create table if not exists user("+"slno int primary key,"+"name varchar(45),"+"email varchar(45),"+"phone bigint"+")");
		return con;
		
	}
	
	
	public void  saveUser(User user) throws Exception
	{
		Connection con=createTable();
		PreparedStatement ps=con.prepareStatement("insert into user values(?,?,?,?)");
		ps.setInt(1,user.getSlno());
		ps.setString(2,user.getName());
		ps.setString(3,user.getEmail());
		ps.setLong(4,user.getPhone());
		
		if(ps.executeUpdate()>0)
		{
			System.out.println("data saved succesfully");
		}
		ps.close();
		con.close();
		
	}
	
	public void  updateUser()
	{
		System.out.println("update method in dao");
	}

	public void  deleteUser()
	{
		System.out.println("delete method in dao");
	}

	public void  fetchUser()
	{
		System.out.println("fetch method in dao");
	}

}
