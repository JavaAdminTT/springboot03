package com.atguigu.springboot.test;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;

import com.atguigu.springboot.test.dao.UserDao;
import com.atguigu.springboot.test.dao.impl.UserDaoImpl;
import com.atguigu.springboot.test.service.UserService;
import com.atguigu.springboot.test.service.impl.UserServiceImpl;

@SpringBootConfiguration // 通过注解来表明该类是一个Spring的配置，相当于一个xml文件
public class SpringBootConfig {
	
	@Bean // 这里要注意,方法名"getUserDao"将作为UserDao在容器中的id
	public UserDao getUserDao() 
	{
		return new UserDaoImpl();
	}
	
	@Bean(value="userService")
	public UserService getUserService() 
	{
		return new UserServiceImpl();
	}
}
