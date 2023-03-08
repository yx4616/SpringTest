package com.it.service.impl;

import com.it.dao.AccountDao;
import com.it.service.AccountService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("accountService")
public class AccountServiceImpl implements AccountService {
    @Resource
    private AccountDao accountDao;

    @Override
    public void transfer(int outUser, int isUser, Double money){
        accountDao.transfer(outUser,isUser,money);
    }
}
