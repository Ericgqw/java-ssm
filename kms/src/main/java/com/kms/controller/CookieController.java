package com.kms.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CookieController {
	@RequestMapping(value="main")
	public ModelAndView main(HttpServletRequest request,HttpServletResponse response){
	     ModelAndView mv=new ModelAndView();
	     Cookie[] cookies=request.getCookies();
			if(null==cookies){
				System.out.println("没有cookie........");
			}else{
				//遍历cookie如果找到登录状态则返回true执行原来的controller的方法
				for(Cookie cookie:cookies){
					if(cookie.getName().equals("isLogin")){
						 mv.setViewName("main");
					     return mv;
					}
				}
			}
			//如果找到登录状态则重定向到登录页，返回false，不执行原来的controller的方法
			mv.setViewName("login");
	        return mv;
	   }
}
