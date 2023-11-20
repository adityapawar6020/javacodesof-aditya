package com.demo.beans;

public class MeetingRoom extends Room{

	private String tv_make;
	private String tv_model;
	
	
	public MeetingRoom() {
		tv_make=null;
		tv_model=null;
	}


	public MeetingRoom(int roomId, String roomName,int capacity, double price, String status,String tv_make, String tv_model) {
		super(roomId,roomName,capacity,price,status);
		this.tv_make = tv_make;
		this.tv_model = tv_model;
	}


	public String getTv_make() {
		return tv_make;
	}


	public void setTv_make(String tv_make) {
		this.tv_make = tv_make;
	}


	public String getTv_model() {
		return tv_model;
	}


	public void setTv_model(String tv_model) {
		this.tv_model = tv_model;
	}
	
	@Override
	public String toString() {
		return super.toString()+"MeetingRoom [tv_make=" + tv_make + ", tv_model=" + tv_model + "]";
	}
	
	
	
}
