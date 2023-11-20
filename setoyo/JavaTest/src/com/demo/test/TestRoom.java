package com.demo.test;

import java.util.Scanner;

import com.demo.dao.RoomService;
import com.demo.dao.RoomServiceImpl;

public class TestRoom {

	public static void main(String[] args) {
		RoomService rs = new RoomServiceImpl();

		int ch;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter 1 to add a new room :");
			System.out.println("Enter 2 to change status of room :");
			System.out.println("Enter 3 to display all rooms :");
			System.out.println("Enter 4 to exit :");
			ch=sc.nextInt();
			
			switch(ch)
			{
			   case 1:
				   rs.addRoom();
				   break;
				   
			   case 2:
				   rs.updateStatus();
				   break;
				   
			   case 3:
				   rs.displayAllRooms();
				   break;
				   
			   case 4:
				   System.out.println("Thank you ....");
				   sc.close();
				   break;
			}
			
		}while(ch!=4);
	}

}
