package com.demo.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.demo.beans.Employee;

public interface EmpService {
	
 public void add(int ch);
 
 public HashSet<Employee> displayall();
 
 public boolean deletebyid1(int id);
 
public Employee showbyid(int id);

public boolean modifysalary(int iid,double amount);

public TreeSet<Employee> sortsal();	 

public TreeSet<Employee> sortbyname();

public Employee[] Ntopmost(int n);
	
	

}
