package com.kms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kms.factory.DataSource;
import com.kms.mapper.Plan_AutoSumMapper;
import com.kms.model.Plan_AutoSum;
import com.kms.model.Plan_AutoSumExample;
import com.kms.model.Plan_AutoSumExample.Criteria;
@Service("Plan_AutoSumService")
@DataSource("RD_AUTO_MachinedataSource")
public class Plan_AutoSumServiceImpl implements Plan_AutoSumService{
  
	 @Autowired
	private Plan_AutoSumMapper plan_AutoSumMapper;
	 @Override
		public List<Plan_AutoSum> getAll() {
			// TODO Auto-generated method stub
			Plan_AutoSumExample example1=new Plan_AutoSumExample();
			Criteria criteria=example1.createCriteria();  //用于定义sql语句后面的where条件
			List<Plan_AutoSum> list=plan_AutoSumMapper.selectByExample(example1);
			return list;
		}

}
