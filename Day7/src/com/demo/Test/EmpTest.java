package com.demo.Test;

import java.util.Scanner;

import com.demo.Service.EmpService;
import com.demo.Service.EmpServiceImp;

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
			break;}
		case 2:
		{
			
		
			break;
		}
		case 3:
		{
			
			break;
		}
		case 4:{
		
			
			break;}
		case 5:{
		
			break;}
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


