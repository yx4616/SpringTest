package com.it.service.impl;

import com.it.dao.UserDao;
import com.it.service.UserService;
import com.it.pojo.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;

    @Override
    public List<User> getAllUser() {
      return userDao.getAllUser();
    }
    
}
