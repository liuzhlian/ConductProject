package com.bangsun.nanjing.ConductProject.controller;

import java.io.IOException;
import java.net.HttpCookie;
import java.util.List;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bangsun.nanjing.ConductProject.mapper.UserMapper;
import com.bangsun.nanjing.ConductProject.pojo.User;

@RestController
public class LoginController {

	@Autowired
	private UserMapper userMapper;

	/**
	 * 访问应用跳转 登录界面
	 * 
	 * @author liuzh
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/login")
	public String Login(HttpServletRequest request, HttpServletResponse response) throws Exception {
		response.sendRedirect("/reports/login.html");
		return null;
	}

	/**
	 * 用户登录验证
	 * 
	 * @author liuzh
	 * @param users
	 * @param request
	 * @param response
	 * @throws Exception
	 */
	@RequestMapping(value = "/userLogin")
	public void userLogin(@RequestBody User users, HttpServletRequest request, HttpSession session,
			HttpServletResponse response) throws Exception {
		JSONObject jsonObject = new JSONObject();
		String username = users.getName();
		String password = users.getPassword();
		List<User> userList = userMapper.findUser(username);
		if (userList != null && userList.size() > 0) {
			for (User user : userList) {
				if (user.getPassword() == password || user.getPassword().equals(password)) {
					System.out.println("login success");
					session.setAttribute("name", username);
					jsonObject.put("message", "登录成功");
					jsonObject.put("status", true);
				} else {
					System.out.println("password error");
					jsonObject.put("message", "密码错误");
					jsonObject.put("status", false);
				}
			}
		} else {
			System.out.println("no such username");
			jsonObject.put("message", "用户名不存在");
			jsonObject.put("status", false);
		}
		// 响应json格式给前端
		response.setCharacterEncoding("UTF-8");
		response.getWriter().print(jsonObject.toString());
	}

}
