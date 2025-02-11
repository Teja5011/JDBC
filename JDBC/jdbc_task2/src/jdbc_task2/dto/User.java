package jdbc_task2.dto; //data transfering object

public class User 
{
	private int slno;
	private String Name;
	private String Email;
	private long phone;
	
	public int getSlno()
	{
		return slno;
	}
	public void setSlno(int slno) {
		this.slno = slno;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	
	
	
}


