package com.bangsun.nanjing.ConductProject.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.bangsun.nanjing.ConductProject.pojo.User;

/**
 * 登录拦截器
 * @author liuzh
 *
 */
@Component
public class ProjectInterceptor implements HandlerInterceptor {

	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub


	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		// TODO Auto-generated method stub
	

	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object obj) throws Exception {
		// TODO Auto-generated method stub

		HttpSession session =request.getSession();
		//存在session会话和登录请求不做拦截
		if(session.getAttribute("name")!=null||request.getRequestURI().endsWith("login.html")||
				request.getRequestURI().endsWith("login")||request.getRequestURI().endsWith("userLogin")){
			return true;
		}
		
		response.sendRedirect(request.getContextPath()+"/login");
		return false;

	}

}
