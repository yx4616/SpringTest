package com.it.dao;

import com.it.Account;

import java.util.List;


public interface AccountDao {
     int addAccount(Account account);

     int updataAccount(Account account);

     int deleteAccount(int id);

     Account findAccountById(int id);

     List<Account> findAllAccount();

     void transfer(int outUser,int isUser,Double money);

}
