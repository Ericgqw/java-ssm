package com.kms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kms.mapper.Plan_AutoDMapper;
import com.kms.mapper.Plan_AutoSumMapper;
import com.kms.mapper.Plan_NGMapper;
import com.kms.mapper.Plan_prdMapper;
import com.kms.model.Plan_AutoD;
import com.kms.model.Plan_AutoDExample;
import com.kms.model.Plan_AutoSum;
import com.kms.model.Plan_AutoSumExample;
import com.kms.model.Plan_NG;
import com.kms.model.Plan_NGExample;
import com.kms.model.Plan_prd;
import com.kms.model.Plan_prdExample;
import com.kms.model.Plan_prdExample.Criteria;

@Service("Plan_prdService")
public class Plan_prdServiceImpl implements Plan_prdService{

	 @Autowired
	 private Plan_prdMapper plan_prdMapper;
	@Override
	public List<Plan_prd> getAll() {
		// TODO Auto-generated method stub
		Plan_prdExample example=new Plan_prdExample();
		Criteria criteria=example.createCriteria();  //用于定义sql语句后面的where条件
		List<Plan_prd> list=plan_prdMapper.selectByExample(example);
		return list;
	}	
}
