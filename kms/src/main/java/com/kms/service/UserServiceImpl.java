package com.kms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kms.factory.DataSource;
import com.kms.mapper.userMapper;
import com.kms.model.user;
import com.kms.model.userExample;
import com.kms.model.userExample.Criteria;

@Service("UserService")
@DataSource("KOIDEdataSource")
public class UserServiceImpl implements UserService{

	@Autowired
    private userMapper userMapper;
	
	@Override
	public List<user> getone(String workid,String password) {
		// TODO Auto-generated method stub
		userExample example=new userExample();
		Criteria criteria=example.createCriteria();  //用于定义sql语句后面的where条件
		criteria.andUseridEqualTo(workid);
		criteria.andPasswordEqualTo(password);
		List<user> list=userMapper.selectByExample(example);
		return list;
	}

	@Override
	public List<user> getall() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertUser(String workid, String name, String password) {
		// TODO Auto-generated method stub
		user user=new user();
		user.setUserid(workid);
		user.setName(name);
		user.setPassword(password);
		user.seteMail(" ");
		user.setPartment(" ");
		userMapper.insertSelective(user);
	}
}
