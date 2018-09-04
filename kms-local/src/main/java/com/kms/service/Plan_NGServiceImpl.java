package com.kms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kms.mapper.Plan_NGMapper;
import com.kms.model.Plan_NG;
import com.kms.model.Plan_NGExample;
import com.kms.model.Plan_NGExample.Criteria;
@Service("Plan_NGService")
public class Plan_NGServiceImpl implements Plan_NGService{

	 @Autowired
	 private Plan_NGMapper plan_NGMapper;
	@Override
	public List<Plan_NG> getAll() {
		// TODO Auto-generated method stub
		Plan_NGExample example3=new Plan_NGExample();
		Criteria criteria=example3.createCriteria();  //用于定义sql语句后面的where条件
		List<Plan_NG> list=plan_NGMapper.selectByExample(example3);
		return list;
	}
}
