package com.bangsun.nanjing.ConductProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bangsun.nanjing.ConductProject.mapper.UserMapper;
import com.bangsun.nanjing.ConductProject.pojo.User;


@RestController
public class UserController {
 
	
	@Autowired
	public UserMapper userMapper;
	
	
	@RequestMapping(value="/findUserByName")
	public List<User> finUser(){
		List<User> userList=userMapper.findUser("刘壮");
		if(userList==null&&userList.size()==0){
			
		}else{
			for(User user: userList){
				System.out.println(user.getId()+"  "+user.getName()+"   "+user.getAge()+"   "+user.getAddress());
			}
		}
		return userList;
	}

}
