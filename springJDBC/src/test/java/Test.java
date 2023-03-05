import com.it.Account;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Test {
    ApplicationContext app = new ClassPathXmlApplicationContext("ApplicationContext.xml");
    @org.junit.Test
    public void testJDBC(){
        JdbcTemplate jdbcTemplate = (JdbcTemplate) app.getBean("jdbcTemplate");
//        jdbcTemplate.("select * from mybatis.product");

    }
}
