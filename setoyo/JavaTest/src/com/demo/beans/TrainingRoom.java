package com.demo.beans;

public class TrainingRoom extends Room{
	
	private String tele;

	public TrainingRoom() {
		tele=null;
	}

	public TrainingRoom(int roomId, String roomName,int capacity, double price, String status,String tele) {
		super(roomId,roomName,capacity,price,status);
		this.tele = tele;
	}

	public String getTele() {
		return tele;
	}

	public void setTele(String tele) {
		this.tele = tele;
	}

	@Override
	public String toString() {
		return super.toString()+"TrainingRoom [tele=" + tele + "]";
	}
	
	

}
