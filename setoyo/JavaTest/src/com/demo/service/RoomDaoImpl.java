package com.demo.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.demo.beans.MeetingRoom;
import com.demo.beans.Room;
import com.demo.beans.TrainingRoom;

public class RoomDaoImpl implements RoomDao{
	Scanner sc = new Scanner(System.in);
	
	static Set<Room> roomList;
	static
	{
		roomList= new HashSet<>();
		roomList.add(new MeetingRoom(1,"Room1",5,1000,"Available","Sony","Bravia"));
		roomList.add(new MeetingRoom(2,"Room2",7,2000,"Available","Lg","Nexus"));
		roomList.add(new TrainingRoom(3,"Room3",10,3000,"Available","585852"));
		roomList.add(new TrainingRoom(4,"Room3",12,4000,"Unavailable","685852"));
		roomList.add(new TrainingRoom(4,"Room3",12,4000,"Unavailable","685852"));
	}

	@Override
	public void saveRoom(Room r) {
		
		roomList.add(r);
	}

	@Override
	public void displayRooms() {
		for(Room re: roomList)
		{
			System.out.println(re);
		}
		
	}

	@Override
	public void changeStatus() {
		System.out.println("Enter room no to update status :");
		int ur = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter status to be changed :");
		String nstat = sc.nextLine();

		boolean flag=false;
		for(Room uur : roomList)
		{
			if(uur.getRoomId()==ur)
			{
				uur.setStatus(nstat);
				flag= true;
				break;
			}
		}
		if(flag)
		{
			System.out.println("Room Status changed Sucessfully");
		}
		else {
			System.out.println("Room not found to update status");
		}
		
	}
	
	@Override
	public void findRoom(int cap) {
		boolean flag= false;
		for(Room r :roomList)
		{
			if(cap<=r.getCapacity())
			{
				flag = true;
			}
		}
		
		
	}

	@Override
	public void bookRoom() {
		System.out.println("Enetr type of room \n 1.Meeting Room \n 2.Training Room");
		int ch = sc.nextInt();
		System.out.println("Enetr capacity of room :");
		int cap = sc.nextInt();
		if(ch == 1)
		{
			
		}
		
	}



}
