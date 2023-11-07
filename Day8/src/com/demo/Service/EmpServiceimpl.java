package com.demo.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import com.demo.Dao.EmpDao;
import com.demo.Dao.EmpDaoimpl;
import com.demo.beans.Employee;

public class EmpServiceimpl implements EmpService {
	
	
	private EmpDao w;
	
   public EmpServiceimpl()
   {
	   w=new EmpDaoimpl();
   }

@Override
public void add(int ch) {
	
	w.add(ch);

	
}

@Override
public HashSet<Employee> displayall() {
	
	return w.displayall();
}

@Override
public boolean deletebyid1(int id) {
	System.out.println("in Services");
	boolean n=  w.deletebyid(id);

	return n;
}

@Override
public Employee showbyid(int id) {
return w.Showbyid(id);
}

@Override
public boolean modifysalary(int iid, double amount) {
	
boolean k=w.ModifySal(iid, amount);
	
	
	return k;
}

@Override
public TreeSet<Employee> sortsal() {

	return w.SalSort();
}

@Override
public TreeSet<Employee> sortbyname() {
	
	return w.Sortbyname();
}

@Override
public Employee[] Ntopmost(int n) {
	
	return w.ntopmost(n);
}





//@Override
//public boolean showbyid(int id) {
//	boolean r=w.Showbyid(int id);
//	return false;
//}
//



	

	
	
	


}
