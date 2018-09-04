package com.kms.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.alibaba.fastjson.JSONObject;
import com.kms.model.Staff;
import com.kms.service.StaffService;

@Controller
public class RegisterController {    
	   @Autowired
	    @Qualifier("StaffService")        
	    private StaffService getdataService;
	 @RequestMapping(value="staff",method = RequestMethod.POST)
	 @ResponseBody
	 public JSONObject staff(HttpServletRequest req){
		String workid=req.getParameter("WORKID");
		List<Staff> staff=getdataService.getone(workid);
		if(staff==null || (staff!=null && staff.size()==0)){
			   JSONObject jsonobject=new JSONObject();
			   jsonobject.put("data","fail");
			   return jsonobject;
			}else{
			   JSONObject jsonobject=new JSONObject();
			   jsonobject.put("data", staff.get(0).getName());
			   return jsonobject;
			}
	 }
	 
}
