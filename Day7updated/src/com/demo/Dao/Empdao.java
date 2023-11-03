package com.demo.Dao;

import java.util.List;

import com.demo.beans.Employe;

public interface Empdao {
	
	public void save(Employe e);
	public boolean remove(int id);
	public List<Employe>  getall();
	public Employe getbyid(int id);
	public boolean alter(int id,double Amt);
	

}
