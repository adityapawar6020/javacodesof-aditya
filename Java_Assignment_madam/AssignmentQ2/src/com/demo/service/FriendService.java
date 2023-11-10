package com.demo.service;

import java.util.List;

import com.demo.beans.Friends;

public interface FriendService {

	Friends[] DisplayAll();

	  Friends SearchById(int id);

	Friends SearchByName(String name);

	List<Friends> DisplayByHobby(String hob); 
		
		
}
