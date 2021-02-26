package com.ioc.impl;

import com.ioc.PersonDao;
import com.ioc.dto.User;

public class PersonDaoImpl implements PersonDao {
    private  User user;

    @Override
    public void print() {
        System.out.println(user.toString());
    }
}