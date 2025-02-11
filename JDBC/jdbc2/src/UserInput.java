
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.util.Scanner;
	import com.mysql.cj.jdbc.Driver;

	public class UserInput
	{
		public static void main(String[] args) throws Exception 
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Welcome");
			DriverManager.registerDriver(new Driver());
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc2?user=root&password=root");
			while (true) 
			{
				System.out.println("Press 1 for save");
				System.out.println("Press 2 for update");
				System.out.println("Press 3 for delete");
				System.out.println("Press 4 for fetch");
				int choice = sc.nextInt();
				switch (choice) 
				{
				case 1:
					System.out.println("Enter id");
					int id = sc.nextInt();
					System.out.println("Enter name");
					String name = sc.next();
					System.out.println("Enter phone number");
					long phone= sc.nextLong();
					System.out.println("Enter email");
					String email = sc.next();

					PreparedStatement save = con.prepareStatement("insert into table1 values(?,?,?,?)");
					save.setInt(1, id);
					save.setString(2, name);
					save.setLong(3, phone);
					save.setString(4, email);
					if (save.executeUpdate() > 0)
					{
						System.out.println("Saved successfully");
					}
					break;
				case 2:
					System.out.println("Enter id");
					int updateId = sc.nextInt();
					System.out.println("Enter new changing email");
					String updateEmail = sc.next();
					System.out.println("Enter new changing phone number");
					long updatePhoneNum = sc.nextLong();

					PreparedStatement update = con.prepareStatement("update table1 set email =?, phone=? where id=?");
					update.setString(1, updateEmail);
					update.setLong(2, updatePhoneNum);
					update.setInt(3, updateId);
					if (update.executeUpdate() > 0)
					{
						System.out.println("update successfully");
					}
					break;
				case 3:
					System.out.println("Enter id to delete");
					int deleteId = sc.nextInt();
					System.out.println("Enter name to delete");
					//long deletePhoneNum = sc.nextLong();
					String deleteName = sc.next();

					PreparedStatement delete = con.prepareStatement("delete from table1 where id = ? and name =?");
					delete.setInt(1, deleteId);
					delete.setString(2, deleteName);
					if (delete.executeUpdate() > 0)
					{
						System.out.println("delete successfully");
					}
					break;
				case 4:
					System.out.println("Enter id to fetch");
					int fetchId = sc.nextInt();
					System.out.println("Enter email to fetch");
					String fetchEmail = sc.next();

					PreparedStatement fetch = con.prepareStatement("select * from table1 where id=? and email=?");
					fetch.setInt(1, fetchId);
					fetch.setString(2, fetchEmail);
					ResultSet rs = fetch.executeQuery();
					if(rs.next())
					{
						System.out.println("Record Found:");
	                    System.out.println("ID: " + rs.getInt("id"));
	                    System.out.println("Name: " + rs.getString("name"));
	                    System.out.println("Email: " + rs.getString("email"));
	                    System.out.println("Phone: " + rs.getLong("phone"));
					}
					else
					{
						System.out.println("no record found");
					}
				}
				System.out.println("Enter 1 to continue");
				System.out.println("Ente 2 to stop");
				int ch = sc.nextInt();
				if(ch == 2)
				{
					con.close();
					System.out.println("Thank You");
					break;
				}
				
			}
		}
	}



