package com.kms.factory;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;

public class HandlerInterceptor implements org.springframework.web.servlet.HandlerInterceptor{

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object object, Exception mv)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object object, ModelAndView mv)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object object) throws Exception {
		// TODO Auto-generated method stub
		//获取request的cookie
		Cookie[] cookies=request.getCookies();
		if(null==cookies){
			System.out.println("没有cookie........");
		}else{
			//遍历cookie如果找到登录状态则返回true执行原来的controller的方法
			for(Cookie cookie:cookies){
				if(cookie.getName().equals("isLogin")){
					return true;
				}
			}
		}
		//如果找到登录状态则重定向到登录页，返回false，不执行原来的controller的方法
		response.sendRedirect("/loginPage");
		return false;
	}

}
