package com.kms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kms.factory.DataSource;
import com.kms.mapper.StaffMapper;
import com.kms.model.Staff;
import com.kms.model.StaffExample;
import com.kms.model.StaffExample.Criteria;


@Service("StaffService")
@DataSource("KOIDEdataSource")
public class StaffServiceImpl implements StaffService{

	@Autowired
	private StaffMapper staffMapper;
	@Override
	public List<Staff> getone(String workid) {
		// TODO Auto-generated method stub
		StaffExample example=new StaffExample();
		Criteria criteria=example.createCriteria();      //用于定义sql语句后面的where条件
		criteria.andWorkidEqualTo(workid);
		List<Staff> list=staffMapper.selectByExample(example);
		return list;	
	}
	@Override
	public List<Staff> getall() {
		// TODO Auto-generated method stub
		return null;
	}
   
}
