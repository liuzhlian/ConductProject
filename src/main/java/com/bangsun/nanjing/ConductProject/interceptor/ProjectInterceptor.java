package com.bangsun.nanjing.ConductProject.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

@Component
public class ProjectInterceptor implements HandlerInterceptor {

	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub
		System.out.println("拦截之后发生了神马呢");

	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		// TODO Auto-generated method stub
		System.out.println("这里好像什么都没有执行 ");

	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object obj) throws Exception {
		// TODO Auto-generated method stub
		Object object = request.getSession();
		if (object == null || object.equals("")) {
			System.out.println("已经准备跳转到登录页面了");
			response.sendRedirect("localhost:8080/login");
			System.out.println(request.getContextPath()+"/login");
			System.out.println("跳转到登录页面了");
			return false;
		}
		return true;

	}

}
