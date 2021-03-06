package com.kms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kms.mapper.Plan_AutoDMapper;
import com.kms.model.Plan_AutoD;
import com.kms.model.Plan_AutoDExample;
import com.kms.model.Plan_AutoDExample.Criteria;
@Service("Plan_AutoDService")
public class Plan_AutoDServiceImpl implements Plan_AutoDService{
     
	 @Autowired
   private Plan_AutoDMapper plan_AutoDMapper;
	 
	 @Override
		public List<Plan_AutoD> getAll() {
			// TODO Auto-generated method stub
			Plan_AutoDExample example2=new Plan_AutoDExample();
			Criteria criteria=example2.createCriteria();  //用于定义sql语句后面的where条件
			List<Plan_AutoD> list=plan_AutoDMapper.selectByExample(example2);
			return list;
		}

}
