package com.it.service.impl;

import com.it.User;
import com.it.service.UserService;
import junit.framework.TestCase;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserServiceImplTest extends TestCase {

    public void testUserLogin() {
        ApplicationContext app = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        UserService userService = (UserService) app.getBean("userService");
        User user =new User();
        user.setUsername("张三");
        user.setUage(20);
        System.out.println(userService.userLogin(user));
    }
}