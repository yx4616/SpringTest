package com.it.dao;

import com.it.vo.User;
import junit.framework.TestCase;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class UserDaoTest extends TestCase {
    ApplicationContext app = new ClassPathXmlApplicationContext("application-dao.xml");
    UserDao userDao = (UserDao) app.getBean("userDao");
    public void testUser() {
        List<User> users =  userDao.queryUser();
        System.out.println(users);
    }
    public  void test2(){
        User user = new User(0,"123","123");
        System.out.println(userDao.addUser(user));
    }
}