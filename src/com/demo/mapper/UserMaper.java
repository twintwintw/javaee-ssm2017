package com.demo.mapper;


import com.demo.bean.User;

public interface UserMaper { 
	
	public int getUserByUsername(User user);
	public int addUser(User user);

}
