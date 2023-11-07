package com.demo.beans;

import java.time.LocalDate;

public class SalariedEmp extends Employee {
	
	private double Sal;
	private double Bonus;
	public SalariedEmp() {
		super();
	}
public SalariedEmp(int id)
	
	{
	
		super(id);
	}
	public SalariedEmp(int pid, String pname, String mobile, String email,String dept, String desg, LocalDate doj,double sal, double bonus) {
		super( pid,  pname, mobile, email,dept, desg, doj);
		Sal = sal;
		Bonus = bonus;
	}
	
	
	public double getSal() {
		return Sal;
	}
	public void setSal(double sal) {
		Sal = sal;
	}
	public double getBonus() {
		return Bonus;
	}
	public void setBonus(double bonus) {
		Bonus = bonus;
	}
	@Override
	public String toString() {
		return super.toString()+"SalariedEmp [Sal=" + Sal + ", Bonus=" + Bonus + "]";
	}
	
	
	

}
