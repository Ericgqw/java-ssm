package com.kms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

@RequestMapping(value="kanban")
public ModelAndView kanban(){
     System.out.println("success");
     ModelAndView mv=new ModelAndView();
     mv.setViewName("kanban");
     return mv;
   }
@RequestMapping(value="print")
public ModelAndView print(){
     System.out.println("success");
     ModelAndView mv=new ModelAndView();
     mv.setViewName("print");
     return mv;
   }
}

