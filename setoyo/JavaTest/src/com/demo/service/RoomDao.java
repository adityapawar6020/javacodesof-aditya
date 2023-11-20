package com.demo.service;

import com.demo.beans.Room;

public interface RoomDao {

	public void saveRoom(Room r);
	
	public void displayRooms();
	
	public void changeStatus();
	
	public void findRoom(int cap);
	
	public void bookRoom();
}
