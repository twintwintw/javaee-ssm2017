package com.demo.controller;

import java.util.ArrayList;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;
import com.demo.bean.User;
import com.demo.service.UserService;
import com.demo.utils.MyUtils;

@SessionAttributes(names={"user"})
@Controller
public class MyController  {
	
	
	@Resource(name="userService")
	private UserService userService;
	
	@RequestMapping(value="user")
	public ModelAndView user(){
		
		ModelAndView modelAndView = new ModelAndView("success");
		 
		return modelAndView;
		
	}

	@RequestMapping(value="login.do",method={RequestMethod.POST})
	public ModelAndView login(@RequestParam String username,@RequestParam String password){
		
		System.out.println("login:" + userService.login(username, password));
		
		String jsp_name = userService.login(username, password) ? "success":"false";
		
		ModelAndView modelAndView = new ModelAndView();
		
		modelAndView.setViewName(jsp_name);
	//	modelAndView.addObject("user", new User(username, password));
		
	//	request.setAttribute("name", "wanwan");
		
		return modelAndView;
	}

	
	@RequestMapping(value="/register",method={RequestMethod.GET})
	public ModelAndView register(){
		
		ModelAndView modelAndView = new ModelAndView("register");
		
		return modelAndView;
	}
	
	@RequestMapping(value="/testEL",method={RequestMethod.GET})
	public ModelAndView testEL(){
		
		
		ArrayList<User> users = new ArrayList<>();
		for(int i = 0;i < 10;i++){
			
			users.add(new User(i,"wan:" + i, "abc" + i));
			
		}
		
		
		ModelAndView modelAndView = new ModelAndView("show");
		modelAndView.addObject("MyUtils", new MyUtils());
		modelAndView.addObject("users", users);
		
		return modelAndView;
	}
	
	
	
	
	
}
