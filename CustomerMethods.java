package miniProjectArray;

public class CustomerMethods {
	private String name;
	private String emailId;
	private String address;
	private long contact;
	private int id;
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
	public void setEmail(String email)
	{
		this.emailId = email;
	}
	
	public String getEmail()
	{
		return emailId;
	}
	
	public void setAddress(String address)
	{
		this.address = address;
	}
	
	public String getAddress()
	{
		return address;
	}
	
	public void setContact(long contact)
	{
		this.contact = contact;
	}
	
	public long getContact()
	{
		return contact;
	}
	
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
	
	public String toString()
	{
		return "ID="+id+"\nName="+name+"\nEmailId="+emailId+"\nAddress="
				+address+"\nContact No="+contact;
	}
	
	public CustomerMethods()
	{
		
	}
	public CustomerMethods(int id,String name,String email,long contact,String address)
	{
		super();
		this.id=id;
		this.name=name;
		this.emailId=email;
		this.contact=contact;
		this.address=address;
	}

}
