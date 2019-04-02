package com.demo.dao;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;
import com.demo.bean.User;
import com.demo.mapper.UserMaper;

@Repository
public class UserDao {

	@Resource 
	private UserMaper userMaper;
	
	public int selectByName(User user){
		 
		return userMaper.getUserByUsername(user);
		
	}
	
	
}
