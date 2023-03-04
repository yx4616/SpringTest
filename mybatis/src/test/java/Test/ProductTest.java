package Test;

import com.rjxy.pojo.Orders;
import com.rjxy.pojo.Users;
import com.rjxy.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class ProductTest {
    @Test
    public void test(){
        SqlSession session = MyBatisUtils.getSession();
        //传入参数查询，返回结果
        Orders orders = session.selectOne("findOrdersWithProduct",1);
        System.out.println(orders);
        //输出结果
        //关闭session
        session.close();
    }
    @Test
    public void test2(){
        SqlSession session = MyBatisUtils.getSession();
        //传入参数查询，返回结果
        Orders orders = session.selectOne("findOrdersWithProduct2",1);
        System.out.println(orders);
        //输出结果
        //关闭session
        session.close();
    }



    /////////////////////////////
    @Test
    public void test3(){
        SqlSession session = MyBatisUtils.getSession();
        //传入参数查询，返回结果
        Orders orders = session.selectOne("selectOrdersById",1);
        System.out.println(orders.toString());
        //输出结果
        //关闭session
        session.close();
    }
}
