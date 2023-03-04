package Test;

import com.rjxy.dao.PersonMapper;
import com.rjxy.pojo.Person;
import com.rjxy.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class PersonTest {
    @Test
    public void test(){
        SqlSession session = MyBatisUtils.getSession();
        Person person = session.selectOne("findPersonById",1);
        System.out.println(person);
        session.close();
    }
    @Test
    public void test2(){
        SqlSession session = MyBatisUtils.getSession();
        Person person = session.selectOne("findPersonById2",1);
        System.out.println(person);
        session.close();
    }



    //注解关联查询
    @Test
    public void  test3(){
        SqlSession session = MyBatisUtils.getSession();
        PersonMapper personMapper = session.getMapper(PersonMapper.class);
        Person person = personMapper.selectPersonById(2);
        System.out.println(person.toString());
        session.close();
    }
}
