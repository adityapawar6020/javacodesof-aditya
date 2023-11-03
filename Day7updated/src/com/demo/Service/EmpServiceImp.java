package com.demo.Service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import com.demo.Dao.Empdao;
import com.demo.Dao.Empdaoimpl;
import com.demo.beans.ContractEmp;
import com.demo.beans.Employe;
import com.demo.beans.SalariedEmp;

public class EmpServiceImp implements EmpService {
	Scanner sc=new Scanner(System.in);
//	SalariedEmp se;
//	ContractEmp ce;
	Employe q;
	
	Empdao w=new Empdaoimpl();
	

	
	@Override
	public void addEmp(int choice) {
		
		
		System.out.println("enter pid");
		int pid=sc.nextInt();
		System.out.println("enter name");
		String name=sc.next();
		System.out.println("enter mobile");
		String mobile=sc.next();
		System.out.println("enter email");
		String email=sc.next();
		
		
		System.out.println("enter dept");
		String dept=sc.next();
		System.out.println("enter desig");
		String desig=sc.next();
		System.out.println("enter date in fromat (dd/MM/yyyy)");
		String date=sc.next();
		LocalDate doj;
		doj=LocalDate.parse(date, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		
		
		switch(choice)
		{
		
		case 1:
		{
		 System.out.println("enter salary");
		 double sal=sc.nextDouble();
		 
	    System.out.println("enter bonus");
	    double bonus=sc.nextDouble();
	    q=new SalariedEmp( pid, name, mobile, email, dept,  desig,doj, sal,bonus);
	    w.save(q);
	    break;
	    }
		case 2:
 		{
         System.out.println("enter charges");
         double charges=sc.nextDouble();
     
         System.out.println("enter hrs");
         int hrs=sc.nextInt();
         q=new ContractEmp(pid, name, mobile, email, dept,desig,doj,charges,hrs);
         w.save(q);
         break;
		
	
	    }
	
	}
	}
	
	public boolean deleteEmp(int id )
	
	{
        return w.remove(id);
        
	}

	@Override
	public List<Employe> displayall() {
		
		return w.getall();
	}

	@Override
	public Employe displaybyid(int id) {
		
		return w.getbyid( id) ;
	}

	@Override
	public boolean modify(int id, double Amt)
	{
	
		if(	w.alter(id, Amt))
	{
		
		return true;
		
	}
		return false;
	}
}
	
	
	
	
	

