package com.atguigu.springboot.test.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.atguigu.springboot.test.dao.UserDao;

public class UserDaoImpl implements UserDao {
	public List<String> queryUserList() {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add("User " + i);
        }
        return list;
    }
}
