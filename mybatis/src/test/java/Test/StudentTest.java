package Test;

import com.rjxy.pojo.Student;
import com.rjxy.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class StudentTest {
    @Test
    public void Test(){
        SqlSession session = MyBatisUtils.getSession();
        Student student = new Student();
        student.setSname("Jim");
        student.setSage(20);
        List<Student> list = session.selectList("selectStudent",student);
        for (Student s:list)
            System.out.println(s.toString());
        session.close();
    }
    @Test
    public  void Test2(){
        SqlSession session = MyBatisUtils.getSession();
        List<Student> list = session.selectList("selectOne");
        for (Student s:list)
            System.out.println(s.toString());
        session.close();

    }
}
