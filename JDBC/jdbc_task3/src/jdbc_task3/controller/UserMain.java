package jdbc_task3.controller;
import java.util.Scanner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;
import com.mysql.cj.jdbc.Driver;

import jdbc_task3.dao.UserCrud;
import jdbc_task3.dto.User;

public class UserMain 
{
	public static void main(String[] args) 
	{
		UserCrud crud=new UserCrud();
		System.out.println("===========Welcome=============");
		Scanner sc = new Scanner(System.in);
		boolean check=true;
		while (check) 
		{
			System.out.println("Press 1 for save");
			System.out.println("Press 2 for update");
			System.out.println("Press 3 for delete");
			System.out.println("Press 4 for fetch");
			System.out.println("enter the key");
			int key = sc.nextInt();
			switch (key) 
			{
			case 1:
			{
				
				User user=new User();
				System.out.println("enter registration number");
				user.setRegno(sc.next());
				System.out.println("enter first name");
				user.setFname(sc.next());
				System.out.println("enter last name");
				user.setLname(sc.next());
				System.out.println("enter dept");
				user.setDept(sc.next());
				System.out.println("enter email");
				user.setEmail(sc.next());
				System.out.println("enter phone");
				user.setPhone(sc.nextLong());
				
				try
				{
					crud.saveUser(user);
				}
				catch(Exception e)
				{
					e.printStackTrace();
					System.err.println("data already exists please enter the new data");
				}
			}
			break;
			case 2:
			{
				crud.updateUser();
			}
			break;
			case 3:
			{
				crud.deleteUser();
			}
			break;
			case 4:
			{
				crud.fetchUser();
			}
			break;
				
			}
			System.out.println("Enter 1 to continue");
			System.out.println("Ente 2 to stop");
			int ch = sc.nextInt();
			if(ch == 2)
			{
				System.out.println("======== Thank You ==========");
				break;
			}
		}
	}
}
