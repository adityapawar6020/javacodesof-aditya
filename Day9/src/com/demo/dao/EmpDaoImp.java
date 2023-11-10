package com.demo.dao;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import com.demo.beans.ContractEmployee;
import com.demo.beans.Employee;
import com.demo.beans.SalariedEmp;

public class EmpDaoImp implements EmpDao
{
	Scanner sc=new Scanner(System.in);

	static Map<Integer,Employee> hm;
    static {
		
		hm=new HashMap<>();
		hm.put(10,new SalariedEmp(10,"a","9876","adi@","ertws","rme",LocalDate.of(1234, 12, 13),10,12000));
		hm.put(90,new SalariedEmp(90,"b","9676","a@","ghka","rrf",LocalDate.of(1999, 12, 16),15,10000));
		hm.put(5,new ContractEmployee(5,"y","9576","a7i@","awsdfs","fcge",LocalDate.of(1288, 12, 13),16,10000));
		hm.put(67,new SalariedEmp(67,"s","9976","ari@","qwes","rdfg",LocalDate.of(1255, 11, 18),15,20000000));
		hm.put(56,new ContractEmployee(56,"c","9376","ati@","ert","erte",LocalDate.of(1244, 11, 12),18,80000));
		hm.put(8,new ContractEmployee(8,"kunal","9376","ati@","ert","erte",LocalDate.of(1244, 11, 12),18,80000));
		
		
    }

	@Override
	public void add(Employee e) {
		
		hm.put(e.getPid(), e);
		
	}


	@Override
	public List<Employee> displayall() {
	
		List<Employee> t=new ArrayList<Employee>();
		
		
		for(Employee e: hm.values())
		{
		t.add(e);
		
			
		}
		return t;
	}


	@Override
	public void deletebyid(int r) {
	
		hm.remove(r);
		
		
	}


	@Override
	public Employee displaybyid(int id) {
		
		return hm.get(id);
		
	}


	@Override
	public void modifysal(int id, double amount)
	{
		
		Employee e=hm.get(id);
		
		
		if (e instanceof SalariedEmp)
		{
			((SalariedEmp)e).setSal(amount);
		
		
	    }
		else if(e instanceof ContractEmployee)
		{
			
		  ((ContractEmployee)e).setCharges(amount);	
		
		}
		
	}


	@Override
	public List<Employee> displaybySalary() {
		
       List<Employee> j=new ArrayList<>();
       
       for(Employee e:hm.values())
       {
       
    	   j.add(e);
       
       }
       
       Comparator<Employee>e=(o1,o2)->{
    	   
    	   double sal1=0;
    	   double sal2=0;
    	    if (o1 instanceof SalariedEmp)
    	    {
    	    	sal1=((SalariedEmp)o1).getSal();
    	    	
    	    }
    	    else if(o1 instanceof  ContractEmployee)
    	    {
    	    	sal1=((ContractEmployee)o1).getCharges();
    	    	
    	    }
    	    
    	    if (o2 instanceof SalariedEmp)
    	    {
    	    	sal2=((SalariedEmp)o2).getSal();
    	    	
    	    }
    	    else if(o2 instanceof  ContractEmployee)
    	    {
    	    	sal2=((ContractEmployee)o2).getCharges();
    	    	
    	    }
    	    
    	    
    	    return (int)(sal1-sal2);
    	    
    };
		
		
        j.sort(e);
	return j;
	}


	@Override
	public TreeMap<Integer,Employee> displaysortedbyid() {
		
		TreeMap<Integer,Employee> g=new TreeMap<Integer,Employee>();
		
		for(Employee e:hm.values())
		{
			g.put( e.getPid(),e);
			
		}	
		
		return g;
	}
		
		
			

	
	

}
