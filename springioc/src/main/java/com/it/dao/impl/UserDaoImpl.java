package com.it.dao.impl;

import com.it.dao.UserDao;

public class UserDaoImpl implements UserDao {
    public boolean login(String name, String password) {
        return name.equals("123") && password.equals("456");
    }

    public void addUser() {
        System.out.println("添加");
    }

    public void deleteUser() {
        System.out.println("删除");
    }
}
