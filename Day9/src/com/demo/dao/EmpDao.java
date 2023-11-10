package com.demo.dao;

import java.util.List;
import java.util.TreeMap;

import com.demo.beans.Employee;

public interface EmpDao {

	public void add(Employee e);
	
	public  List<Employee>displayall();
	public void deletebyid(int r);
	public Employee displaybyid(int id);
	public void modifysal(int id,double amount);
	public List<Employee> displaybySalary();
	public TreeMap<Integer,Employee> displaysortedbyid();
}
