package com.kms.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kms.model.Plan_AutoD;
import com.kms.model.Plan_AutoSum;
import com.kms.model.Plan_NG;
import com.kms.model.Plan_prd;
import com.kms.service.*;
import com.alibaba.fastjson.JSONObject;

@Controller
public class GetDatasController {
	
	    @Autowired
	    @Qualifier("Plan_prdService")        
	    private Plan_prdService getdataService;
	    @Autowired
	    @Qualifier("Plan_AutoDService")        
	    private Plan_AutoDService getdataService1;
	    @Autowired
	    @Qualifier("Plan_AutoSumService")        
	    private Plan_AutoSumService getdataService2;
	    @Autowired
	    @Qualifier("Plan_NGService")        
	    private Plan_NGService getdataService3;
	    
	    @ResponseBody
		@RequestMapping(value = "getlist" , method = RequestMethod.POST)
		public  JSONObject  getlist(HttpServletRequest req){
	    	List<Plan_prd> plan_prd=getdataService.getAll();
	    	JSONObject jsonObject = new JSONObject();
	    	jsonObject.put("plan_prd",plan_prd);
	    	return jsonObject;		
			} 
	    @ResponseBody
	  	@RequestMapping(value = "getbasic" , method = RequestMethod.POST)
	  	public  JSONObject  getbasic(HttpServletRequest req){
	  		List<Plan_AutoSum> plan_AutoSum=getdataService2.getAll();
	  	    JSONObject jsonObject = new JSONObject();
	  		jsonObject.put("plan_AutoSum",plan_AutoSum);
	  		return jsonObject;		
	  		} 	    
	    @ResponseBody
	  	@RequestMapping(value = "getbar" , method = RequestMethod.POST)
	  	public  JSONObject  getbar(HttpServletRequest req){
	  		List<Plan_AutoD> plan_AutoD=getdataService1.getAll();
	  	    JSONObject jsonObject = new JSONObject();
	  		jsonObject.put("chart",plan_AutoD);
	  		return jsonObject;		
	  		} 	    
	    @ResponseBody
	  	@RequestMapping(value = "getline" , method = RequestMethod.POST)
	  	public  JSONObject  getline(HttpServletRequest req){
	  		List<Plan_NG> plan_NG=getdataService3.getAll();
	  	    JSONObject jsonObject = new JSONObject();
	  		jsonObject.put("chart",plan_NG);
	  		return jsonObject;		
	  		} 	    
}
