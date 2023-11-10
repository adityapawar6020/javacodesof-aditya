package com.demo.beans;
import java.time.LocalDate;
import java.util.Arrays;

public class Friends {
	private int id;
	private String name,lastname;
	private String mobno,email;
	private LocalDate bdate;
	private String address;
	private String[]hobs;
 
public Friends(int id, String name, String lastname, String mobno, String email,LocalDate bdate, String address,String[]hobs) {
	super();
	this.id = id;
	this.name = name;
	this.lastname = lastname;
	this.mobno = mobno;
	this.email = email;
	this.bdate = bdate;
	this.address = address;
	this.hobs=hobs;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public String getMobno() {
	return mobno;
}
public void setMobno(String mobno) {
	this.mobno = mobno;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public LocalDate getBdate() {
	return bdate;
}
public void setBdate(LocalDate bdate) {
	this.bdate = bdate;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public  String[] getHobs() {
	return hobs;
}
public  void setHobs(String[] hobs) {
	this.hobs = hobs;
}
@Override
public String toString() {
	return "Friends [id=" + id + ", name=" + name + ", lastname=" + lastname + ", mobno=" + mobno + ", email=" + email
			+ ", bdate=" + bdate + ", address=" + address +"Hobbies"+ Arrays.toString(hobs)+"]";
}
 
}
