import com.it.MyProxy;
import com.it.dao.UserDao;
import com.it.dao.impl.UserDaoImpl;
import org.junit.Test;

public class JDKTest {
    @Test
    public void test(){
        MyProxy proxy = new MyProxy();
        UserDao userDao = new UserDaoImpl();
        UserDao userDao1 = (UserDao) proxy.createProxy(userDao);
        userDao1.addUser();
        userDao1.deleteUser();
    }
}
