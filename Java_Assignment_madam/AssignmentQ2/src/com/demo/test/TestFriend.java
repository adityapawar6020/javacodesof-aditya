package com.demo.test;

import java.util.List;
import java.util.Scanner;

import com.demo.beans.Friends;
import com.demo.service.FriendService;
import com.demo.service.FriendsServiceImpl;

public class TestFriend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ch;
		Scanner sc=new Scanner(System.in);
		FriendService fs=new FriendsServiceImpl();
		do {
			
			System.out.println("1. Display All Friend\n2. Search by id\n3. Search by name\n4. Display all friend with a particular hobby \n5. Exit\nchoice: ");
			ch=sc.nextInt();
			switch(ch) {
		case 1:
		 Friends[] farr=fs.DisplayAll();
		 for(int i=0;i<farr.length;i++) {
			 if(farr[i]!= null) {
				 System.out.println(farr[i]);
			 }else {
			 break;
			 }
		 }
			break;
		case 2:
			System.out.println("Enter id of friend:");
			int id=sc.nextInt();
			Friends f=fs.SearchById(id);
			if(f!=null) {
				System.out.println(f);
			}
			break;
		case 3:
			System.out.println("Enter name of friend:");
			 String name=sc.next();
			 f=fs.SearchByName(name);
			if(f!=null) {
				System.out.println(f);
			}
			break;
		case 4:
			System.out.println("Enter hobbies");
			sc.nextLine();
			 String hob=sc.next();
			 List<Friends> fr=fs.DisplayByHobby(hob);
			 System.out.println(fr);
			
			break;
		case 5:
			sc.close();
			System.out.println("Thank you");
			break;
			default:
				System.out.println("Wrong Choice");
		}
		}while(ch!=5);

	}

	
}
