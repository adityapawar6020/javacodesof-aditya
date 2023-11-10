package com.demo.beans;

public class Person {
	

	private int pid;
	private String name;
	private String mobile;
	private String email;
	
	
	public Person() {
		super();
	}
	
	
	
	public Person(int pid)
	{
	this.pid=pid;
	}
	
	

	
	
	public boolean equals(Object ob)
	{
		return this.pid==((Person)ob).pid;
	}
	
	public Person(int pid, String name, String mobile, String email) {
		super();
		this.pid = pid;
		this.name = name;
		this.mobile = mobile;
		this.email = email;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Person [pid=" + pid + ", name=" + name + ", mobile=" + mobile + ", email=" + email + "]";
	}
	
	
}
