package com.it.dao;

import com.it.pojo.User;

import java.util.List;

public interface UserDao {
    List<User> queryUser();
    int addUser(User user);

}
