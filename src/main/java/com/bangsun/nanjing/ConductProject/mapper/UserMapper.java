package com.bangsun.nanjing.ConductProject.mapper;

import java.util.List;

import com.bangsun.nanjing.ConductProject.pojo.User;

/**
 * 用户管理
 * @author liuzh
 *
 */
public interface UserMapper {

	public boolean addUser(User user);
	
	public boolean delUser(String str);
	
	public User updateUser();
	
	public List<User> findUser(String str);

}
