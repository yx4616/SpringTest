package com.it.dao.impl;

import com.it.Account;
import com.it.dao.AccountDao;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.List;

@Controller("accountDao")
public class AccountDaoImpl implements AccountDao {
    @Resource
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int addAccount(Account account) {
        String sql = "insert into account(username,balance) value(?,?)";
        Object[] params = new Object[]{
                account.getUsername(),
                account.getBalance()
        };
        return this.jdbcTemplate.update(sql, params);
    }

    @Override
    public int updataAccount(Account account) {
        String sql = "update account set username = ?, balance =? where id = ?";
        Object[] params = new Object[]{
                account.getUsername(),
                account.getBalance(),
                account.getId()
        };
        return this.jdbcTemplate.update(sql, params);
    }

    @Override
    public int deleteAccount(int id) {
        String sql = "delete  from account where id =?";
        return jdbcTemplate.update(sql, id);
    }

    @Override
    public Account findAccountById(int id) {
        String sql = "select * from account where id =?";
        RowMapper<Account> rowMapper = new BeanPropertyRowMapper<Account>(Account.class);
        return this.jdbcTemplate.queryForObject(sql, rowMapper, id);
    }

    @Override
    public List<Account> findAllAccount() {
        String sql = "select * from account";
        RowMapper<Account> rowMapper = new BeanPropertyRowMapper<Account>(Account.class);
        return this.jdbcTemplate.query(sql, rowMapper);
    }

    @Override
    public void transfer(int outUser, int isUser, Double money) {
        this.jdbcTemplate.update("update account set balance = balance +? where id = ?", money, isUser);
//        int i = 1/0;
        this.jdbcTemplate.update("update account set balance = balance - ? where id = ?", money, outUser);
    }
}
