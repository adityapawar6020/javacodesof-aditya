package com.demo.beans;

import java.time.LocalDate;


public class Employe extends Person {

	 private String dept;
	 private String desig;
	 private LocalDate doj;
	public Employe() {
		super();
	}
	public Employe(int pid, String name, String mobile, String email,String dept, String desig, LocalDate doj) {
		super( pid, name,  mobile, email);
		this.dept = dept;
		this.desig = desig;
		this.doj = doj;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getDesig() {
		return desig;
	}
	public void setDesig(String desig) {
		this.desig = desig;
	}
	public LocalDate getDoj() {
		return doj;
	}
	public void setDoj(LocalDate doj) {
		this.doj = doj;
	}
	@Override
	public String toString() {
		return super.toString()+"Employe [dept=" + dept + ", desig=" + desig + ", doj=" + doj + "]";
	}
	 
	
	  
}
