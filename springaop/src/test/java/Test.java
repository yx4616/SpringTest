import com.it.CGlibProxy;
import com.it.JDKProxy;
import com.it.UserDao;
import com.it.impl.UserDaoImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");

    @org.junit.Test
    public void JDKProxyTest(){
        JDKProxy jdkProxy = (JDKProxy) app.getBean("userDaoJDKProxy");
//        UserDaoImpl userDao = new UserDaoImpl();
//        JDKProxy jdkProxy = new JDKProxy(userDao);
        UserDao proxy = (UserDao) jdkProxy.geProxy();
        proxy.addUser();
        proxy.deleteUsr();
    }

    @org.junit.Test
    public void CGlibProxyTest(){
       CGlibProxy cGlibProxy = (CGlibProxy) app.getBean("userDaoCGlibProxy");
//        UserDaoImpl userDao = new UserDaoImpl();
//        JDKProxy jdkProxy = new JDKProxy(userDao);
        UserDao proxy = (UserDao) cGlibProxy.getProxy();
        proxy.addUser();
        proxy.deleteUsr();
    }
}
