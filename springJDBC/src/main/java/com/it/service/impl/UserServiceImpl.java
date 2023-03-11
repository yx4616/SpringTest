package com.it.service.impl;

import com.it.User;
import com.it.dao.UserDao;
import com.it.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;
    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT)
    @Override
    public int userLogin(User user) {
        if (userDao.userLogin(user)!=null)
            return 1;
        return 0;
    }
}
