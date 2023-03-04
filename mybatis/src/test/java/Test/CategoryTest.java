package Test;

import com.rjxy.pojo.Category_product;
import com.rjxy.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class CategoryTest {
    @Test
    public void test(){
        SqlSession session = MyBatisUtils.getSession();
        List<Category_product> list =  session.selectList("findCategoryType");
        for (Category_product c:list)
            System.out.println(c.toString());
        session.close();
    }
}
