package com.atguigu.springboot.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atguigu.springboot.test.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/hellospringboot")
	public String hello()
	{
		System.out.println(userService.queryUserList().size());
		return "hello springboot 2017.10.10************O(∩_∩)O哈哈~";
	}
}
