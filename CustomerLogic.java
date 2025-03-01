package miniProjectArray;
import java.util.*;
public class CustomerLogic {
	CustomerMethods cms[] = new CustomerMethods[10];
	int index = 0;
	CustomerMethods cms1;
	
	public boolean addCustomer(CustomerMethods c)
	{
		if(index<10)
		{
			cms[index] = c;
			index++;
			c.setId(index);
			return true;
		}
		else
			return false;
	}
	
	public boolean deleteProfile(String email)
	{
		for(int i=0;i<cms.length;i++)
		{
			cms1 = cms[i];
			if(cms1!= null)
			{
				if(cms1.getEmail().equals(email));
				{
					cms[i]=null;
					return true;
				}
			}
		}
		return false;
	}
	
	
	public CustomerMethods showProfile(String email)
	{
		for(int i =0;i<cms.length;i++)
		{
			cms1=cms[i];
			if(cms1!=null)
			{
				if(cms1.getEmail().equals(email))
				{
					return cms1;
				}
			}
		}
		return null;
	}
	
	public CustomerMethods[] showAllProfile()
	{
		boolean ref=false;
		for(int i=0;i<cms.length;i++)
		{
			if(cms[i]!=null)
			{
				ref=true;
				break;
			}
		}
		
		if(ref==true)
			return cms;
		else
			return null;
	}
	
	public boolean updateCustomer(String email)
	{
		for(int i=0;i<cms.length;i++)
		{
			 if (cms[i] != null && cms[i].getEmail().equals(email))
				{
					Scanner sc = new Scanner(System.in);
					System.out.println("Enter your name");
					String uname = sc.nextLine();
					System.out.println("Enter your emailId");
					String uemail = sc.nextLine();
					System.out.println("Enter your contact number");
					long ucontact = sc.nextLong();
					sc.nextLine();
					System.out.println("Enter your address");
					String uaddress = sc.nextLine();
					
					cms[i].setName(uname);
					cms[i].setEmail(uemail);
					cms[i].setContact(ucontact);
					cms[i].setAddress(uaddress);
					
							
				  return true;  
			}
		}
		return false;
	}
}
