package com.it.service;

import com.it.vo.User;
import com.it.service.impl.UserServiceImpl;
import junit.framework.TestCase;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class UserServiceTest extends TestCase {

    public void testListUser() {
        ApplicationContext app = new ClassPathXmlApplicationContext("application-dao.xml");
        UserServiceImpl userServiceImpl = (UserServiceImpl) app.getBean("userServiceImpl");
        List<User> list = userServiceImpl.listUser();
        System.out.println(list);
    }
}