package Test;

import com.rjxy.dao.UsersMapper;
import com.rjxy.pojo.Users;
import com.rjxy.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class UsersTest {
    @Test
    public void test(){
        SqlSession session = MyBatisUtils.getSession();
        //传入参数查询，返回结果
        Users users = session.selectOne("findUserWithOrders",1);
        System.out.println(users);
        //输出结果
        //关闭session
        session.close();
    }

    ////////////////////////////////////////////////////////////
    @Test
    public  void test1(){
        SqlSession session = MyBatisUtils.getSession();
        UsersMapper mapper = session.getMapper(UsersMapper.class);
        Users users = mapper.selectUserById(1);
        System.out.println(users.toString());
    }



}
