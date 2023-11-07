package com.demo.beans;

import java.time.LocalDate;

public class ContractEmp extends Employee{
	
	private double charges;
	private int hrs;
	public ContractEmp(int pid, String pname, String mobile, String email,String dept, String desg, LocalDate doj,double charges, int hrs) {
		super(pid, pname, mobile, email,dept, desg, doj);
		this.charges = charges;
		this.hrs = hrs;
	}
	public ContractEmp() {
		super();
	}
	
	

public ContractEmp(int id)

{

	super(id);
}
	
	public double getCharges() {
		return charges;
	}
	public void setCharges(double charges) {
		this.charges = charges;
	}
	public int getHrs() {
		return hrs;
	}
	public void setHrs(int hrs) {
		this.hrs = hrs;
	}
	@Override
	public String toString() {
		return super.toString()+ "ContractEmp [charges=" + charges + ", hrs=" + hrs + "]";
	}

	
}
