package com.atguigu.springboot.test.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atguigu.springboot.test.dao.UserDao;
import com.atguigu.springboot.test.service.UserService;


@Service
public class UserServiceImpl implements UserService 
{
	@Autowired
    UserDao userDao;
	
	@Override
	public List<String> queryUserList() 
	{
		return userDao.queryUserList();
	}
}
