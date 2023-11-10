package com.demo.test;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Stream;

import com.demo.Service.EmpService;
import com.demo.Service.EmpServiceImp;
//
//	import cmo.demo.beans.Employee;
//	import com.demo.service.EmployeeService;
//	import com.demo.service.EmployeeServiceImpl;
import com.demo.beans.Employee;

	public class TestHashMap {
		public static void main(String[] args) {

		    EmpService eservice=new EmpServiceImp();
		    Scanner sc=new Scanner(System.in);
			int choice;
		    
	        do {
			System.out.println("1. Add new Employee\n2. delete employee by id\n 3. modify salary");
			System.out.println("4. Display all\n5. display by id\n 6. sort by salary\n7. sort by id");
			System.out.println("8. Display n topmost based on salary \n 9.Display all employees with sal > given salary\n10.exit\n choice:");

			
		
			choice=sc.nextInt();
			switch(choice) {
			case 1:
			
               eservice.add();
			   break;
			   
			   
		      case 2:
			  System.out.println("enter id for which you want to delete data");
			  int r=sc.nextInt();
			  eservice.deletebyid(r);
		      break;
						
		      
		      case 3:
		    	  System.out.println("enter id and amount");
		    	  int id=sc.nextInt();
		    	  double amount=sc.nextDouble();
		    	  eservice.ModifySalbyid(id, amount);
			   
			   
			case 4:
				
				List <Employee>h=new ArrayList<>();
				h=eservice.displayall();
		        h.stream().forEach(System.out::println);
			    
			   break;
			   
			   
			case 5:
				System.out.println("enter id that you want to display");
				int j=sc.nextInt();
			
				Employee e=new Employee();
				e=eservice.displaybyid(j);
				System.out.println(e);
				break;
				
				
			case 6:
				System.out.println("this will give you output in sorted salary");
				
				List<Employee> x=eservice.DisplaybySalary();
				x.stream().forEach(System.out::println);
				
				break;
				
			case 7:
				System.out.println("this will sort the output on id");
				TreeMap<Integer,Employee> z=eservice.displaysortedbyid();
				
				List<Employee> l=new ArrayList<>();
				for(Employee u:z.values())
				{
				
					l.add(u);
				
				}
				l.stream().forEach(System.out::println);
				
				
				break;
				
				
			case 8:
				
				System.out.println("enter how many top do you want in output");
				int b=sc.nextInt();
				
                TreeMap<Integer,Employee> y=eservice.displaysortedbyid();
				
				//List<Employee> k=new ArrayList<>();
                
                Employee[] k=new Employee[b];
				for(Employee u:y.values())
				{
				
				  k[i]=u;
				
				}
				
				
				
				for(i=0;i<b;i++)
				{
					System.out.println(k[i]);
				}
				


				
				break;
				
				
			   
			case 9:
		
				   
			   
		 case 10:
			{
				sc.close();
			}
			}
			}while(choice!= 10);
		}
	}
			
			
	
//			case 2:
//				System.out.println("enetr id for delete");
//				int id=sc.nextInt();
//				boolean status=eservice.deleteById(id);
//				if(status) {
//					System.out.println("deleted successfully");
//				}
//				else {
//					System.out.println("not found");
//				}
//				break;
//			case 3:
//				System.out.println("enetr id for modify");
//				id=sc.nextInt();
//				System.out.println("enter salary");
//				double sal=sc.nextDouble();
//				status=eservice.modifySalById(id,sal);
//				if(status) {
//					System.out.println("modified successfully");
//				}
//				else {
//					System.out.println("not found");
//				}
//				break;
//			case 4:
//				List<Employee> eset=eservice.displayAll();
//				if(eset!=null) {
//					eset.stream().forEach(System.out::println);
//				}
//				break;
//			case 5:
//				System.out.println("enetr id for search");
//				 id=sc.nextInt();
//				Employee e=eservice.displayById(id);
//				if(e!=null) {
//					System.out.println(e);
//				}
//				else {
//					System.out.println("not found");
//				}
//				break;
//			case 6:
//				List<Employee> elst=eservice.sortBySalary();
//				elst.stream().forEach(System.out::println);
//				break;
//			case 7:
//				TreeMap<Integer,Employee> tm=eservice.sortById();
//				Set<Integer> ks=tm.keySet();
//				/*for(Integer k:ks) {
//					System.out.println(tm.get(k));
//				}*/
//				ks.stream().forEach(ob->{System.out.println(tm.get(ob));});
//				break;
//			case 8:
//				System.out.println("How many topmost employees based on salary you want?");
//				int n=sc.nextInt();
//				Employee[] earr=eservice.getTopNEmployees(n);
//				Stream.of(earr).forEach(System.out::println);
//				break;
//			case 9:
//				System.out.println("enter salary to search");
//				sal=sc.nextDouble();
//				List<Employee> elist=eservice.getBySalary(sal);
//				if(elist!=null) {
//					elist.stream().forEach(System.out::println);
//				}
//				else {
//					System.out.println("not found");
//				}
//				break;
//			case 10:
//				sc.close();
//				System.out.println("Thank you for visiting....");
//				break;
//			default:
//				System.out.println("wrong choice");
//			}
//			}while(choice!=10);
//		}

	
	
	
	


