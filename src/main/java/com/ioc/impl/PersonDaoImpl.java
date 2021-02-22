package com.ioc.impl;

import com.ioc.PersonDao;

public class PersonDaoImpl implements PersonDao {
    private int id;
    private String name;

    public PersonDaoImpl(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println(id + name);
    }
}
