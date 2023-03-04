import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    @org.junit.Test
    public void test(){
        ApplicationContext app  = new ClassPathXmlApplicationContext("applicationContextBean2.xml");
        System.out.println(app.getBean("bean2"));
    }


}
