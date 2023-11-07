package com.demo.Dao;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.demo.beans.Employee;

public interface EmpDao {
	
	public void add(int ch);
	public HashSet<Employee> displayall();
	public boolean deletebyid(int id);
	public Employee Showbyid(int id);
	public boolean ModifySal(int id,double amount);
	public TreeSet<Employee> SalSort();
	public TreeSet<Employee> Sortbyname();
	public Employee[] ntopmost(int n);
  
}
