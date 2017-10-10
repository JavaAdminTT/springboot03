package com.atguigu.springboot.test;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.atguigu.springboot.test.service.UserService;


@SpringBootApplication
public class MainApplication {

/*	public static void main(String[] args) {
		AnnotationConfigApplicationContext acac = new AnnotationConfigApplicationContext(SpringBootConfig.class);
        UserService userService = (UserService) acac.getBean("userService");
        
        List<String> list = userService.queryUserList();
        
        System.out.println(list.toString());

	}*/
	
	public static void main(String[] args) 
	{
		ConfigurableApplicationContext ctx = SpringApplication.run(MainApplication.class, args);
		
        UserService userService = (UserService) ctx.getBean("userService");
        
        List<String> list = userService.queryUserList();
        
        System.out.println(list.toString());
        
        //ctx.close();
	}
	
	

}
