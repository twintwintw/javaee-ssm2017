package com.demo.service;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.demo.bean.User;
import com.demo.dao.UserDao;

@Service
public class UserService {

	@Resource()
	private UserDao userDao;
	 
	public boolean login(String username,String password) {
		
		 return userDao.selectByName(new User(username, password)) == 1 ? true:false;
		
	}
	
}
