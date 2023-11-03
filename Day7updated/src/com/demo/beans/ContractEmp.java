package com.demo.beans;

import java.time.LocalDate;

public class ContractEmp extends Employe {
	
	private double charges;
	private int hours;
	public ContractEmp() {
		super();
	}
	
	//check karcyeil ki nai
	public ContractEmp(int id) {
		super(id);
	}
	
	
	public ContractEmp(int pid, String name, String mobile, String email,String dept, String desig, LocalDate doj,double charges, int hours) {
		super(pid,  name,  mobile,  email, dept,  desig,  doj);
		this.charges = charges;
		this.hours = hours;
	}
	public double getCharges() {
		return charges;
	}
	public void setCharges(double charges) {
		this.charges = charges;
	}
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	@Override
	public String toString() {
		return super.toString()+ "ContractEmp [charges=" + charges + ", hours=" + hours + "]";
	}
	
	
	

}
