package com.demo.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.demo.beans.Friends;

public class FriendsServiceImpl implements FriendService {
	private static Friends[]farr;
    private static int  cnt;
   private static String[]hobbies;
   // List<String> hobbies=new ArrayList<>();

    static {
    //	id,name,lastname,hobbies,mobno,email,bdate,address
    	//LocalDate.of(2002, 01, 02)
    	farr=new Friends[10];
    	//hobbies=new String[5];
    	hobbies = new String[]{ "Travelling" ,"Reading","writing"}; 
    	farr[0]=new Friends(0,"sona","khedkar","444","khe@12",LocalDate.of(2002, 01, 02),"maharastra",hobbies);
    	hobbies = new String[]{ "Travelling","sleep" ,"Reading novels","Watching movie"}; 
    	farr[1]=new Friends(1,"vishal","khedkar","444","khe@12",LocalDate.of(1988, 12, 02),"maharastra",hobbies);
    	hobbies = new String[]{ "Travelling","sleep" ,"Reading novels","Watching movie"}; 
    	farr[2]=new Friends(2,"Shubham","bahdeakr","444","kbh@12",LocalDate.of(1988, 12, 02),"maharastra",hobbies);
    	cnt=3;
    }
    
    
    
    
    
    
    
//   public static  String[] InputHobbies(){
//	   Scanner sc=new Scanner(System.in);
//	   System.out.println("Enter no of hobbies :");
//	   int size=sc.nextInt();
//	   sc.nextLine();
//	   String[] hobbies1=new String[size];
//	   System.out.println("Enter all of hobbies :");
//	   for(int i=0;i<size;i++) {
//		   hobbies[i]=sc.next();
//	   }
//	   
//	return hobbies1;
//    	
//    }
//   public static void AddFriend() {
//	    
//   }
	public Friends[] DisplayAll() {
		return farr;
		
	}







	@Override
	public Friends SearchById(int id) {
		 for(Friends f:farr) {
			 if(id==f.getId()) {
				 return f;
			 }
		 }
		 return null;
	}







	@Override
	public Friends SearchByName(String name) {
		for(Friends f:farr) {
			if(name==f.getName()) {
				return f;
			}
		}
		return null;
	}







	@Override
	public List<Friends> DisplayByHobby(String hob) {
		//Friends[]f1=new Friends[5];
		List<Friends> flist=new ArrayList<>();
		for(int i=0;i<cnt;i++) {
			String[] str=farr[i].getHobs();
			for(int j=0;j<str.length;j++) {
				if(str[j]!=null) {
					if(str[j].equals(hob)) {
						 
						flist.add(farr[i]);
					
					
				}
				}
				
					
			}
		}
		return flist;
	}
	

}
