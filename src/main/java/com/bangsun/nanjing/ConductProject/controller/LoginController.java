package com.bangsun.nanjing.ConductProject.controller;

import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
	
	@RequestMapping(value="/login")
	public String Login(HttpServletRequest request,HttpServletResponse response) throws Exception{
		response.sendRedirect("/reports/login.html");
		return null;
	}

}
