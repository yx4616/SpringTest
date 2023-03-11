package Test;

import com.rjxy.dao.PersonMapper;
import com.rjxy.dao.StudentMapper;
import com.rjxy.pojo.Student;
import com.rjxy.pojo.Student2;
import com.rjxy.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class StudentTest {
    @Test
    public void Test() {
        SqlSession session = MyBatisUtils.getSession();
        Student student = new Student();
        student.setSname("Jim");
        student.setSage(20);
        List<Student> list = session.selectList("selectStudent", student);
        for (Student s : list)
            System.out.println(s.toString());
        session.close();
    }

    @Test
    public void Test2() {
        SqlSession session = MyBatisUtils.getSession();
        List<Student> list = session.selectList("selectOne");
        for (Student s : list)
            System.out.println(s.toString());
        session.close();
    }

    @Test
    public void findStudent() {
        SqlSession session = MyBatisUtils.getSession();
        StudentMapper studentMapper = session.getMapper(StudentMapper.class);
        Student2 student2 = studentMapper.selectStudentMapper(2);
        System.out.println(student2);
    }
    @Test
    public void update() {
        SqlSession session = MyBatisUtils.getSession();
        StudentMapper studentMapper = session.getMapper(StudentMapper.class);
        Student2 student2 = new Student2();
        student2.setId(4);
        student2.setName("李雷");
        student2.setAge(21);
        System.out.println(studentMapper.updateStudentMappper(student2));
    }
    @Test
    public void test(){
        SqlSession session = MyBatisUtils.getSession();
        StudentMapper studentMapper = session.getMapper(StudentMapper.class);
        List<Student2> list = studentMapper.selectStudentByCid(1);
        for (Student2 student2 :list)
            System.out.println(student2);
    }
}
