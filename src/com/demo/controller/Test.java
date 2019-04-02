package com.demo.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;
import com.demo.bean.User;
import com.demo.service.UserService;

@Controller
public class Test {

	@Resource
	private UserService userService;
	
	public String add() {
		
		return "";
	}
	
	@RequestMapping("/a")
	public String a(){
		
		System.out.println("a.......");
		
		return "success";
		
	} 
	
	@RequestMapping("/b")
	public String b(@Valid User user,BindingResult result){
	
		System.out.println(user);
		System.out.println(result);
		
		if(result.hasErrors()){
			
			System.out.println("error");
			
			List<ObjectError> list =  result.getAllErrors();
			
			for(ObjectError objectError : list){
				
				System.out.println(objectError.getDefaultMessage());
				
			}
			
		}else{
			
			System.out.println("no error");
			
		}
		
		return "success";
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
