package com.demo.Service;

import java.util.List;
import java.util.TreeMap;

import com.demo.beans.Employee;

public interface EmpService {
	
	public void add();
	public List<Employee> displayall();
	public void deletebyid(int r);
    public Employee displaybyid(int id);
    public void ModifySalbyid(int id,double amount);
    public List<Employee> DisplaybySalary();
    public TreeMap<Integer,Employee>displaysortedbyid();

}
