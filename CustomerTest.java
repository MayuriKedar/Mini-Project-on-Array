package miniProjectArray;
import java.util.*;
public class CustomerTest {

	public static void main(String[] args) {
		CustomerLogic customerLogic = new CustomerLogic();

		Scanner sc = new Scanner(System.in);
		
		
		boolean exit = false;
		boolean flag;
		
		do {
			System.out.println("Welcome to our Page....Please enter your choice");
			System.out.println("1. Create Profile");
			System.out.println("2. Update Profile");
			System.out.println("3. Show Profile");
			System.out.println("4. Show All Profiles");	
			System.out.println("5. Delete Profile");
			System.out.println("6. Exit");
			
			int choice=sc.nextInt();
			
			
			switch(choice)
			{
			case 1:
				System.out.println("**********Create Profile*********");
				System.out.println("Enter your name");
				String name = sc.next();
				System.out.println("Enter your emailId");
				String email = sc.next();
				System.out.println("Enter your contact number");
				long contact = sc.nextLong();
				System.out.println("Enter your address");
				String address = sc.next();
				
				CustomerMethods c = new CustomerMethods();
				
				c.setName(name);
				c.setEmail(email);
				c.setContact(contact);
				c.setAddress(address);
				
				flag = customerLogic.addCustomer(c);
				if(flag==true)
					System.out.println("Registered Successfully");
				else
					System.out.println("Failed to register...Try again");
				break;
				
			case 2:
				System.out.println("*******Update Profile*********");
				System.out.println("Enter your email");
				String uemail=sc.next();
				flag=customerLogic.updateCustomer(uemail);
				if(flag==true)
					System.out.println("Profile Updated Successfully");
				else
					System.out.println("Failed to update your profile....Try again");
				break;
			
			case 3:
				System.out.println("***********Show Profile************");
				System.out.println("Enter your email");
				String showEmail = sc.next();
				c=customerLogic.showProfile(showEmail);
				if(c!=null)
				{
					System.out.println("Your Profile Details:\n" +c);
				}
				else
					System.out.println("No profile found");
				break;
				
			case 4:
				System.out.println("***********Show All Profiles*************");
				CustomerMethods[] custArray=customerLogic.showAllProfile();
				if(custArray==null)
				{
					System.out.println("No profile found");
				}
				else 
				{
					System.out.println("Profiles are");
					for(int i=0;i<custArray.length;i++) 
					{
						if(custArray[i]!=null)
						{
						System.out.println(custArray[i]);
						}
					}
				}
				break;
				
			case 5:
				System.out.println("***********Delete Profile***********");
				System.out.println("Enter your email");
				String deleteEmail = sc.next();
				flag=customerLogic.deleteProfile(deleteEmail);
				if(flag==true)
					System.out.println("Profile Deleted Successfully");
				else
					System.out.println("Failed to delete your profile");
				break;
				
			case 6:
				System.out.println("Do you really want to exit....enter 'y' for Yes or 'n' for No");
				char initial = sc.next().charAt(0);
				if(initial == 'y' || initial == 'Y')
				{
					System.out.println("Thank You!!!Do visit again!!!");
					exit=true;
				}
				else
				{
					System.out.println("Thankyou for staying with us :)");
				}
				break;
				
			default:
				System.out.println("Please enter a number of option by your choice");
				break;
			}
			
		}while(exit==false);
		
		sc.close();
		
	}
}
