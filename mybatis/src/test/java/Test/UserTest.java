package Test;

import com.rjxy.pojo.User;
import com.rjxy.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserTest {

    //查找
    @Test
    public void userFindByIdTest() {
        SqlSession session = MyBatisUtils.getSession();
        //传入参数查询，返回结果
        User user = session.selectOne("findOne", 1);
        //输出结果
        System.out.println(user.getUsername());
        //关闭session
        session.close();
    }
    @Test
    public void userFindAllTest() {
        SqlSession session =MyBatisUtils.getSession();
        //传入参数查询，返回结果
        List<User> list = session.selectList("findAll");
        for(User u:list){
            System.out.println(u.toString());
        }
        //输出结果
        //关闭session
        session.close();
    }

    //添加
    @Test
    public void userAddOneTest() {
        SqlSession session = MyBatisUtils.getSession();
        User user = new User();
        user.setUsername("333");
        user.setJobs("333");
        user.setPhone("333");
        System.out.println(user.toString());
        session.insert("addOne",user);
        //如果没有commit，数据库是不会插入数据的
        session.commit();
        //关闭session
        session.close();
    }
    //删除
    @Test
    public void userDelOneTest() {
        SqlSession session =MyBatisUtils.getSession();
        session.delete("delOne",1);
        //如果没有commit，数据库是不会插入数据的
        session.commit();
        //关闭session
        session.close();
    }
    //修改
    @Test
    public void userUpdateOneTest() {
        SqlSession session = MyBatisUtils.getSession();;
        User user = new User();
        user.setId(2);
        user.setUsername("333");
        user.setJobs("333");
        user.setPhone("333");
        session.update("updateOne",user);
        //如果没有commit，数据库是不会插入数据的
        session.commit();
        //关闭session
        session.close();
    }
}

