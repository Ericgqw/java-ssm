package com.kms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

@RequestMapping(value="kanban")
public ModelAndView kanban(){
     ModelAndView mv=new ModelAndView();
     mv.setViewName("kanban");
     return mv;
   }
@RequestMapping(value="print")
public ModelAndView print(){
     ModelAndView mv=new ModelAndView();
     mv.setViewName("print");
     return mv;
   }
@RequestMapping(value="register")
public ModelAndView register(){
     ModelAndView mv=new ModelAndView();
     mv.setViewName("register");
     return mv;
   }

}

