package com.it.dao.impl;

import com.it.Account;
import com.it.dao.AccountDao;
import com.it.service.AccountService;
import com.it.service.impl.AccountServiceImpl;
import junit.framework.TestCase;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class AccountDaoImplTest extends TestCase {
    ApplicationContext app = new ClassPathXmlApplicationContext("ApplicationContext.xml");
    AccountDaoImpl accountDao = (AccountDaoImpl) app.getBean("accountDao");
    AccountService accountService = (AccountService) app.getBean("accountService");
    public void testAddAccount() {
        Account account = (Account) app.getBean("account");
        System.out.println(account);
        if (accountDao.addAccount(account) > 0)
            System.out.println("yes");
    }

    public void testUpdataAccount() {
        Account account = (Account) app.getBean("account");
        System.out.println(account);
        if (accountDao.updataAccount(account) > 0)
            System.out.println("yes");
    }

    public void testDeleteAccont() {
        if (accountDao.deleteAccount(1) > 0)
            System.out.println("yes");
    }

    public void testFindAccountById() {
        Account account = accountDao.findAccountById(3);
        System.out.println(account);
    }

    public void testFindAllAccount() {
        List<Account> accounts = accountDao.findAllAccount();
        for (Account account : accounts)
            System.out.println(account);
    }

    public void testTransfer() {
       accountService.transfer(3,4,100.0);

    }
}