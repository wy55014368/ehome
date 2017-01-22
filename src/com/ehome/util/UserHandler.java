package com.ehome.util;

import java.util.ArrayList;
import java.util.List;

import com.ehome.entity.User;


public class UserHandler {

	private List<User> list = new ArrayList<User>();
	
	public void addUser(User user){
		list.add(user);
	}
	
	public List<User> select(){
		return list;
	}
}
