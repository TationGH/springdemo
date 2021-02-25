package com.ioc.impl;

import com.ioc.PersonDao;
import com.ioc.dto.User;

public class PersonDaoImpl implements PersonDao {
    private  User user;

    // 提供set()方法，用于依赖注入
    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public void print() {
        System.out.println("Hello World!" + user.toString());
    }
}