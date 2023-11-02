package com.demo.beans;

import java.time.LocalDate;

public class SalariedEmp extends Employe {

	private double Sal;
	private double bonus;
	public SalariedEmp() {
		super();
	}
	public SalariedEmp(int pid, String name, String mobile, String email,String dept, String desig, LocalDate doj,double sal, double bonus) {
		super( pid,  name,  mobile,  email, dept,  desig, doj);
		Sal = sal;
		this.bonus = bonus;
	}
	public double getSal() {
		return Sal;
	}
	public void setSal(double sal) {
		Sal = sal;
	}
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	@Override
	public String toString() {
		return super.toString()+"SalariedEmp [Sal=" + Sal + ", bonus=" + bonus + "]";
	}
	
	
	
}


