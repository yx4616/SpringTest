package com.it.service.impl;

import com.it.dao.UserDao;
import com.it.service.UserService;

public class UserServiceImpl implements UserService {
    UserDao userDao ;
    public void setUserDao(UserDao userDao){
        this.userDao=userDao;
    }
    public boolean login(String name, String password) {
        return userDao.login(name,password);
    }
}
