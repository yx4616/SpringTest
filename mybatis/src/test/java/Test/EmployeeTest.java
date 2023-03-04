package Test;

import com.rjxy.pojo.Employee;
import com.rjxy.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class EmployeeTest {
    //查找
    @Test
    public void employeeFindByIdTest() {
        SqlSession session = MyBatisUtils.getSession();
        //传入参数查询，返回结果
        Employee employee = session.selectOne("findOneEmployeeMapper", 2);
        //输出结果
        System.out.println(employee.toString());
        //关闭session
        session.close();
    }
    @Test
    public void employeeFindAllTest() {
        SqlSession session =MyBatisUtils.getSession();
        //传入参数查询，返回结果
        List<Employee> list = session.selectList("findAllEmployeeMapper");
        for(Employee e:list){
            System.out.println(e.toString());
        }
        //输出结果
        //关闭session
        session.close();
    }

    //添加
    @Test
    public void employeeAddOneTest() {
        SqlSession session = MyBatisUtils.getSession();
       Employee employee = new Employee("4",4,"4");
        System.out.println(employee.toString());
        session.insert("addOneEmployeeMapper",employee);
        //如果没有commit，数据库是不会插入数据的
        session.commit();
        employeeFindAllTest();
        //关闭session
        session.close();
    }
    //删除
    @Test
    public void employeeDelOneTest() {
        SqlSession session = MyBatisUtils.getSession();
        session.delete("delOneEmployeeMapper",7);
        //如果没有commit，数据库是不会插入数据的
        session.commit();
        //关闭session
        employeeFindAllTest();
        session.close();
    }
    //修改
    @Test
    public void employeeUpdateOneTest() {
        SqlSession session = MyBatisUtils.getSession();
        Employee employee = new Employee("6", 6, "6");
        employee.setId(2);
        session.update("updateOneEmployeeMapper", employee);
        //如果没有commit，数据库是不会插入数据的
        session.commit();
        //关闭session
        employeeFindAllTest();
        session.close();
    }
    @Test
    public void employeeLikeTest() {
        SqlSession session =MyBatisUtils.getSession();
        //传入参数查询，返回结果
        Employee employee = new Employee();
        employee.setName("6");
        List<Employee> list = session.selectList("likeEmployeeMapper",employee);
        for(Employee e:list){
            System.out.println(e.toString());
        }
        //输出结果
        //关闭session
        session.close();
    }
}

