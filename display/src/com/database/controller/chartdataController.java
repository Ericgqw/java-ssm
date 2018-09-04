package com.database.controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.json.JSONException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.datebase.getdatas;

@Controller
public class chartdataController {
   	    @ResponseBody
	  	@RequestMapping(value = "chart_data")
	  	public  String  getbasic(HttpServletRequest req) throws SQLException, JSONException, ClassNotFoundException{
	  	String sql=req.getParameter("sql").trim(); 
	  	String db_ip=req.getParameter("db_ip").trim();
	  	String db_name=req.getParameter("db_name").trim();
	  	String db_port=req.getParameter("db_port").trim();
	  	//url=jdbc:mysql://localhost:3306/rd-auto_machine
   		String url="jdbc:mysql://"+db_ip+":"+db_port+"/"+db_name;
	  	getdatas data=new getdatas();
	  	ResultSet result=data.execSql(sql,url,"root","it12345678");
   		String data1=data.resultSetToJson(result);
	  	return data1;		
	 } 	    
}