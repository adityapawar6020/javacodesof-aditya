package com.demo.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import com.demo.Service.EmpServiceimpl;
import com.demo.beans.Employee;
import com.demo.Service.EmpService;



public class TestEmp {
	
	public static void main(String[] args)
	{
		
		
		EmpService eservice=new EmpServiceimpl();
		
		int choice=0;
		do {
			System.out.println("1.add new employee \n2.Display all \n3.delete by id \n4.display by id");
			System.out.println("5.sort by sal \n6.sort by name \n7.modify salary \n8.n top most salary \n9.exit");
			Scanner sc = new Scanner(System.in);
			choice = sc.nextInt();
			switch(choice) {
			case 1:
				
				System.out.println("enter 1 for Salaried and 2 for Contract");
				int ch=sc.nextInt();
				eservice.add(ch);
				break;
			case 2:
				//System.out.println(eservice.displayall());
				//mamchaway
				Set<Employee> eset=eservice.displayall();
				if(eset!=null) {
					eset.stream().forEach(System.out::println);
				}
				break;
			case 3:
				
		 	    System.out.println("enter id for which you want to delete ");		
			    int id=sc.nextInt();
                //eservice.deletebyid(id);
				boolean status=eservice.deletebyid1(id);
				if(status) {
					System.out.println("deleted successfully");
				}
				else {
					System.out.println("not found");
				}
				break;
			case 4:
			
				System.out.println("enter id for which you want output");
				int cid=sc.nextInt();
				Employee e=eservice.showbyid(cid);
				System.out.println(e);
				break;
			case 5:
				
				System.out.println(" in this output salary is in  sorted/asc manner");
				TreeSet<Employee> rs=new TreeSet<>();
             	rs=eservice.sortsal();
				for(Employee es:rs)
				{
					System.out.println(es);
				}
				break;
			case 6:
				
			    System.out.println("this will give  an out in which the output is sorted by  name ");
			    
			    
			   // eka line madhe deta
	            // System.out.println(eservice.sortbyname());
	              
	              
	              
	              
	            Set<Employee> elst=eservice.sortbyname();
	  			elst.stream().forEach(System.out::println);
    
			    
			    
			     break;
			case 7:
				System.out.println("enter id for which you want for salary/amount ");
				
				int iid=sc.nextInt();
				double amt=sc.nextDouble();
				
				boolean t=eservice.modifysalary(iid, amt);
				
				if(t)
				{
					System.out.println("salary modified");
				}
						
				else
				{
					System.out.println("not modified because not found");
				}
				
				
				break;
			case 8:
				
				
				System.out.println("enter no of topmost salary that you want in output");
				int n=sc.nextInt();
				
				Employee[]u=eservice.Ntopmost(n);
			       for(int i=0;i<u.length;i++) {
			    	  
			    	   System.out.println(u[i]);
			    	   
			    	   
			       }
				
			//	System.out.println(u);
				
				
				
				
				break;
			case 9:
				
				System.out.println("Thank you!!");
				sc.close();
				break;
			
			}
		}while(choice!=9);
	}

}
