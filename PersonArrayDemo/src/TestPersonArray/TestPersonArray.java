package TestPersonArray;

import java.util.Scanner;

import com.demo.beans.Person;
import com.demo.service.*;

 

public class TestPersonArray
{
	
 public static void main(String[] args)
 {
	 
	 int choice = 0;
	 PersonService ps= new PersonServiceImpl();
	 
	 do 
	 {
		 System.out.println("enter 1 for add enter 2 for display all enter 3 for display by id enter 4 for exit ");
		// System.out.println("Enter a choice ");
			Scanner sc=new Scanner(System.in);
			 choice=sc.nextInt();
		 
	
	switch(choice)
	 {
	 case 1:
	 {
		 
		 ps.addperson();
		 break;
	}
     case 2:
	 {
	
		Person[] part= ps.displayall();
		for(int i=0;i<part.length;i++)
		{
			if(part[i]!=null) {
				
				System.out.println(part[i]);
		}
		
		// break;
		}
		break;
	 } 
		 
	 case 3:
	 {
		break; 
	 }	 
	 case 4:
	 {
		System.out.println("thanks for visiting");
		sc.close();
		System.exit(0);
		break;
	 }
	 
	 default:
		 System.out.println("wrong choice");
	 
	 
	 }
	 
	 
	 } while(choice!=4);
	 
 
}
 
}
	


