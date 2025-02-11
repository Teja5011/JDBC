package jdbc_task3.dto;

public class User 
{
	private String regno;
	private String fname;
	private String lname;
	private String dept;
	private String email;
	private long phone;
	
	public String getRegno() 
	{
		return regno;
	}
	public void setRegno(String regno) 
	{
		this.regno = regno;
	}
	public String getFname()
	{
		return fname;
	}
	public void setFname(String fname) 
	{
		this.fname = fname;
	}
	public String getLname() 
	{
		return lname; 
	}
	public void setLname(String lname) 
	{
		this.lname = lname;
	}
	public String getDept()
	{
		return dept;
	}
	public void setDept(String dept)
	{
		this.dept = dept;
	}
	public String getEmail() 
	{
		return email;
	}
	public void setEmail(String email)
	{
		this.email = email;
	}
	public long getPhone() 
	{
		return phone;
	}
	public void setPhone(long phone)
	{
		this.phone = phone;
	}
}
