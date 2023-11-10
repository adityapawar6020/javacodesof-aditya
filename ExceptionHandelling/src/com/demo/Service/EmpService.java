package com.demo.Service;

import java.util.List;

import com.demo.beans.Employe;

public interface EmpService {
	


	public  void addEmp(int choice) ;
	
	public boolean deleteEmp(int id);
	
	public List<Employe> displayall();
	
	public Employe displaybyid(int id);
	
	public boolean modify(int id,double Amt);
	
}
