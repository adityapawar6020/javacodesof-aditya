package com.demo.Dao;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import com.demo.beans.ContractEmp;
import com.demo.beans.Employee;
import com.demo.beans.SalariedEmp;

public class EmpDaoimpl implements EmpDao  {
	
	static Set<Employee> hs;
	
	static {
		
		hs=new HashSet<>();
		hs.add(new SalariedEmp(1, "Adi","3456", "adf","sdf", "asdf", LocalDate.of(1234, 12, 12),100,124));
		hs.add(new SalariedEmp(2, "A","121212", "A","B", "C", LocalDate.of(1221, 2, 10),1000,120));
		hs.add(new SalariedEmp(3, "Z","131313", "X","Z", "Z",LocalDate.of(2000, 11, 9),1346,100));
		hs.add(new SalariedEmp(4, "P","141414", "aASDf","ssddf", "asaadf", LocalDate.of(1968,11 , 7),10,1223));
		hs.add(new SalariedEmp(1, "M","151515", "aqaa","vvv", "assaddf", LocalDate.of(2001, 12, 8),1300,150));
	}

	@Override
	public void add(int ch)
	{
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter id");
		int pid=sc.nextInt();
		System.out.println("enter name");
		String pname=sc.next();
		System.out.println("enter mobile");
		String mobile=sc.next();
		System.out.println("enter email");
		String email=sc.next();
		System.out.println("enter dept");
		String dept=sc.next();
		System.out.println("enter desg");
		String desg=sc.next();
		System.out.println("enter date dd/mm/yyyy");
		String date=sc.next();
		LocalDate doj=LocalDate.parse(date,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		
	
		
		
		if (ch==1)
		{
		System.out.println("enter sal");
		double sal=sc.nextDouble();
		System.out.println("enter bonus");
		double bonus=sc.nextDouble();
		hs.add(new SalariedEmp( pid, pname, mobile, email,dept, desg,doj,sal, bonus  ));
		
		}
		
		else
	    {
			System.out.println("enter charges");
			double charges=sc.nextDouble();
			System.out.println("enter hrs");
			int hrs=sc.nextInt();
			hs.add(new ContractEmp(  pid, pname, mobile, email,dept, desg,doj,charges,hrs   ));
			
	    }
	

		
		
	}

	@Override
	public HashSet<Employee> displayall() {
		
		return (HashSet<Employee>) hs;
	}
	
	
	//if hash code is on the basis of id then it wont take entry with duplicate entry

	@Override
	public boolean deletebyid(int id) {
		
		System.out.println("inempdaoimpl");
	
	boolean w=hs.remove(new SalariedEmp(id));
	return w;
		
		
		
		
	}

	@Override
	public Employee Showbyid(int id) {
		
		for(Employee e:hs)
		{
		
			if (e.getPid()==id)
			{
				return e;
			}
		
     	}
			return null;
		
		
	}

	@Override
	public boolean ModifySal(int id, double amount) {
		for(Employee e:hs)
		{
				if(e.getPid()==id)
				
			{
				
              if(e instanceof SalariedEmp)
	 
                {
            	  
            	  ((SalariedEmp) e).setSal(amount);
            	 }
              else if(e instanceof ContractEmp)
              {
            	((ContractEmp) e).setCharges(amount);  
              
                 
              }
               
              return true;
              
         
            }
				
		}
		 return false;
	
}

	@Override
	
	public TreeSet<Employee> SalSort() 
	{

		Comparator<Employee> mysal=(o1,o2)->{
			
			
			double sal1=0;	double sal2=0;
			
			if(o1 instanceof SalariedEmp)
			{
				sal1=((SalariedEmp) o1).getSal();
				
			}
			else if(o1 instanceof ContractEmp)
			{
				
				sal1=((ContractEmp) o1).getCharges();		
			}
			
			if(o2 instanceof SalariedEmp)
			{
				sal2=((SalariedEmp) o2).getSal();
				
			}
			else if(o2 instanceof ContractEmp)
			{
				
				sal2=((ContractEmp) o2).getCharges();		
			}
 
			return (int)(sal1-sal2);
			
		};
		
		TreeSet<Employee> ts= new TreeSet<> (mysal);
		
		for(Employee e:hs)
		{
			ts.add(e);
			
		}
		
		return ts;	
		
	}

	@Override
	public TreeSet<Employee> Sortbyname() {
		
		
		TreeSet<Employee> r=new TreeSet<>();
		
		for(Employee e:hs)
		{
			r.add(e);
			
		}
		
		
		return r;
	}

	@Override
	public Employee[] ntopmost(int n) {
		
		TreeSet<Employee> j=SalSort();
		
		
		
		Employee[] k1=new Employee[n];
		int cnt=0;
		for(Employee m:j)
		{
		  
		  
		  if(cnt==n)
			break;  
		
		  k1[cnt] =m;
	      cnt++;
		   
			 
		  
			
		}
		
	return k1;
		
		
	
		
		
		
		
		
	
	}

	
}
	
