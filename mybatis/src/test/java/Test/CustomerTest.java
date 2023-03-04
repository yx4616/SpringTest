 package Test;

import com.rjxy.pojo.Customer;
import com.rjxy.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class CustomerTest {
    @Test
    public void findCustomerByNameAndJobs( ){
        SqlSession session = MyBatisUtils.getSession();
        Customer customer = new Customer();
        customer.setUsername("jack");
        customer.setJobs("teacher");
        List<Customer> list =session.selectList("findCustomerByNameAndJobs",customer);
        for (Customer c:list)
            System.out.println(c.toString());
    }
    @Test
    public void findCustomerByNameOrJobs(){
        SqlSession session = MyBatisUtils.getSession();
        Customer customer = new Customer();
        customer.setUsername("tom");
        customer.setJobs("teacher");
        List<Customer> list =session.selectList("findCustomerByNameOrJobs",customer);
        for (Customer c:list)
            System.out.println(c.toString());
    }
}
