package com.demo.Service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;

import com.demo.beans.ContractEmployee;
import com.demo.beans.Employee;
import com.demo.beans.SalariedEmp;
import com.demo.dao.EmpDao;
import com.demo.dao.EmpDaoImp;

public class EmpServiceImp implements EmpService {
	Scanner sc=new Scanner(System.in);

	
    public EmpDao w=new EmpDaoImp();
	

	public void add(){
		
	 e.parse(date,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		
		 System.out.println("System.out.println("enter id");
		 int id=sc.nextInt();
		// sc.nextLine();
         System.out.println("enter name");
         String name=sc.next();
        
		 System.out.println("enter mobile");
		 String mobile=sc.next();
		 System.out.println("Enter Mail");
		 String mail=sc.next();
		 System.out.println("enter dept");
		 String dept=sc.next();
		 System.out.println("enter designation");
		 String designation=sc.next();
		 System.out.println("enter date in format (dd/MM/yyyy");
		 String date=sc.next();
		LocalDate dt=LocalDatenter 1 for salaried and 2 for contract");
		 int choice=sc.nextInt();
		 
		 
		 switch(choice)
		 {
		 
		 case 1:
		 {
			 System.out.println("enter Salary");
			 double Sal=sc.nextDouble();
			 System.out.println("enter bonus");
			 double bonus=sc.nextDouble();
			 Employee e=new SalariedEmp(id, name, mobile, mail,dept, designation, dt,Sal, bonus);
			  w.add(e);
			
			 break;
		 }
		 case 2:
		 {
			 System.out.println("enter hrs");
			 int hrs=sc.nextInt();
			 
			 
			 System.out.println("enter charges");
			 double charges=sc.nextDouble();
			 Employee e=new ContractEmployee(id, name, mobile, mail,dept, designation, dt,hrs, charges);
             w.add(e);
			 break; 
		 }
		 }
		
	
		 
		 
		 
		 

}

	@Override
	public List<Employee> displayall() {
		
		return w.displayall();
	}

	@Override
	public void deletebyid(int r) {
		
		w.deletebyid(r);
		
	}

	@Override
	public Employee displaybyid(int id) {
	
		return w.displaybyid(id);
	}

	@Override
	public void ModifySalbyid(int id, double amount) {
		w.modifysal(id, amount);
		
	}

	@Override
	public List<Employee> DisplaybySalary() {
		 return w.displaybySalary();
		
	}

	@Override
	public TreeMap<Integer,Employee> displaysortedbyid() {
		return w.displaysortedbyid();
		
	}

	

 
	 
	
	

}
