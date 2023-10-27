import java.util.Scanner;

public class TestpersonArr
{

	

	public static void main(String args[])
	{


		int choice=0;


		do 
		{
			System.out.println("Enter 1 for Add  new person\nEnter 2 for display all\nEnter 3 for display by id\nEnter 4 for update mobile by id\nEnter 5 for display by name\nEnter 6 for exit choice");
			Scanner sc=new Scanner(System.in);
			
			choice =sc.nextInt();

			switch(choice) 
			{

			case 1:
			{
				PersonService.addperson();
				break;
			}	
			case 2:
			{
				PersonService.displayall();
				break;
			}
			case 3:
			{
				System.out.println("enter a id whose details you want to search");
				int pid=sc.nextInt();
				PersonService.searchbyid(pid);
				break;
			}	
					     
			case 4:
			{
				//update mobile number by id
				System.out.println("enter id for which you want to change mobile number");
				//Scanner sc=sc.new(System.in);
				int pid=sc.nextInt();
			
			//	System.out.println(parr[pid])
				
				
				PersonService.updatemob(pid);
				
				
				
			 break;
			}
			case 5:
			{
				System.out.println("enter a pname");
				String pname=sc.nextLine();
				PersonService.searchbyname(pname);
				break;
			}
			case 6:
			{
				System.out.println("Thank you for visiting");
				//System.exit(0);//use only if you have multiple user
			}
			default:
			{
				
			
				System.out.println("you have entered a wrong choice");
				break;

			}
			}  

		}while(choice!=6);



	}
}
