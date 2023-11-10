package com.demo.beans;

public class friends {



	int id;
    String name;
	String Location;
	
	
	public friends() {
		super();
	}
	
	public friends(int id, String name, String location) {
	this.id = id;
	this.name = name;
	Location = location;
	}

	@Override
	public String toString() {
		return "friends [id=" + id + ", name=" + name + ", Location=" + Location + "]";
	}
	
	
	
	
	
	
	

}
