package com.it.service.impl;

import com.it.dao.UserDao;
import com.it.vo.User;
import com.it.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;

    @Override
    public List<User> listUser() {
       return userDao.queryUser();
    }
}
