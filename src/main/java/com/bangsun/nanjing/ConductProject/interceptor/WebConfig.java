package com.bangsun.nanjing.ConductProject.interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class WebConfig extends WebMvcConfigurerAdapter {

	@Autowired
	public ProjectInterceptor proInt;
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		// TODO Auto-generated method stub
		System.out.println("拦截已经进来了？");
		registry.addInterceptor(proInt).addPathPatterns("/**");
		System.out.println("已经开始 拦截了");
		super.addInterceptors(registry);
	}

}
