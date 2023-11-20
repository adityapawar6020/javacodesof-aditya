package com.demo.dao;

import java.util.Scanner;

import com.demo.beans.MeetingRoom;
import com.demo.beans.Room;
import com.demo.beans.TrainingRoom;
import com.demo.service.RoomDao;
import com.demo.service.RoomDaoImpl;

public class RoomServiceImpl implements RoomService{

	private RoomDao rd;
	public RoomServiceImpl() {
		rd=new RoomDaoImpl();
	}
	
	Scanner sc = new Scanner(System.in);
	//Add a new Room
	@Override
	public void addRoom() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the type of Room \n1 Meeting Room \n2. Training Room \nChoice :");
		int ch = sc.nextInt();
		if(ch==1)
		{
			System.out.println("Enter room no :");
			int rid = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter room name :");
			String rnm = sc.nextLine();
			System.out.println("Enter Capacity :");
			int cap = sc.nextInt();
			System.out.println("Enter price of room :");
			double price = sc.nextDouble();
			sc.nextLine();
			System.out.println("Enter Status :");
			String stat = sc.nextLine();
			System.out.println("Enter tv make :");
			String tvm = sc.nextLine();
			System.out.println("Enetr tv model :");
			String tm = sc.nextLine();
			Room mr = new MeetingRoom(rid,rnm,cap,price,stat,tvm,tm);
			rd.saveRoom(mr);
		}
		
		if(ch==2)
		{
			System.out.println("Enter room no :");
			int rid = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter room name :");
			String rnm = sc.nextLine();
			System.out.println("Enter Capacity :");
			int cap = sc.nextInt();
			System.out.println("Enter price of room :");
			double price = sc.nextDouble();
			sc.nextLine();
			System.out.println("Enter Status :");
			String stat = sc.nextLine();
			System.out.println("Enter telephone number :");
			String tel = sc.nextLine();
			Room tr = new TrainingRoom(rid,rnm,cap,price,stat,tel);
			rd.saveRoom(tr);
		}
		
	}

	
	//Display all Rooms
	@Override
	public void displayAllRooms() {
		rd.displayRooms();
		
	}

	//Update Status of the room
	@Override
	public void updateStatus() {
		rd.changeStatus();
		
	}


	
	
	
}
