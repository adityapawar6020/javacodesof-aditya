package com.demo.beans;

import java.util.Objects;

public class Room {

	private int roomId;
	private String roomName;
	private int capacity;
	private double price;
	private String status;
	
	
	public Room() {
		roomId=0;
		roomName=null;
		capacity=0;
		price=0;
		status=null;
	}


	public Room(int roomId, String roomName,int capacity, double price, String status) {
		super();
		this.roomId = roomId;
		this.roomName = roomName;
		this.capacity=capacity;
		this.price = price;
		this.status = status;
	}


	public int getRoomId() {
		return roomId;
	}


	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}


	public String getRoomName() {
		return roomName;
	}


	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}
	
	


	public int getCapacity() {
		return capacity;
	}


	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	
	@Override
	public int hashCode() {
		return Objects.hash(roomId);
	}


	@Override
	public boolean equals(Object obj) {
         return this.roomId==((Room)obj).roomId;
	}


	@Override
	public String toString() {
		return "Room [roomId=" + roomId + ", roomName=" + roomName + ", capacity=" + capacity + ", price=" + price
				+ ", status=" + status + "]";
	}



	
	
	
	
}
