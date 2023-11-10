package com.demo.Test;

import java.util.List;
import java.util.Scanner;

import com.demo.Service.EmpService;
import com.demo.Service.EmpServiceImp;
import com.demo.beans.Employe;

public class EmpTest {
	public static void main(String[] args) {
		
		EmpService e=new EmpServiceImp();
		
		
	
	 int choice;
	
	do 
	{	
		
		System.out.println("1. Add new Employee\n2. delete employee by id\n 3. modify salary");
		System.out.println("4. Display all\n5. display by id\n 6. sort by salary\n7. sort by name\n8.exit\n choice: ");
		
		Scanner sc=new Scanner(System.in);
		choice=sc.nextInt();
		
		switch(choice)
		{
		
		case 1:{
			System.out.println("enter 1 for salaried and 2 for contract");
            int ch=sc.nextInt();
            e.addEmp(ch);			
			break;
			}
		case 2:
		{
			
			System.out.println("enter id which you want yo delelte");
            int ch=sc.nextInt();
            
            boolean b=e.deleteEmp(ch);
            System.out.println(b);
            
            
            break;
		}
		case 3:
		{
			

			System.out.println("enter id and amt for which you want to modify salary/charges");
			int id=sc.nextInt();
			double Amt=sc.nextDouble();	
			e.modify(id, Amt);
			
			break;
		}
		case 4:{
			
			//Myway
			//System.out.println(e.displayall());
			//Ask this to omkar
			
			
			List<Employe> elist=e.displayall();
            if(elist!=null)
            {
            	elist.stream().forEach(System.out::println);
            }
            break;
		}
			  
		case 5:{
			
			System.out.println("enterid");
			int id=sc.nextInt();
		//	e.displaybyid(id);
		   System.out.println(e.displaybyid(id));
		    break;
			}
		case 6:{
		
			break;}
		case 7:{
		
			break;}
		case 8:
		{
			System.out.println("Thank you for visiting!!");
			break;
		}
			
		
		
		}
		
	}while(choice!=8);
}
}


