import com.it.SpringConfig;
import com.it.Student;
import com.it.dao.UserDao;
import com.it.pojo.User;
import com.it.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.swing.*;

public class UserTest {
    ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
    @Test
    public void test(){
        User user = app.getBean("user",User.class);
        System.out.println(user);
    }

    @Test
    public void test2(){
        User user = app.getBean("user2",User.class);
        System.out.println(user);
    }

    @Test
    public void test3(){
        UserService userService = (UserService) app.getBean("userService");
        boolean flag = userService.login("123","456");
        if (flag)
            System.out.println("yes");
        else
            System.out.println("no");
    }

    @Test
    public void test4(){
        Student student = (Student) app.getBean("student");
        System.out.println(student);
        AbstractApplicationContext ac = (AbstractApplicationContext) app;
        ac.registerShutdownHook();
    }


    @Test
    public void test5(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        Student student = (Student) applicationContext.getBean("student");
        System.out.println(student.toString());

    }
}
