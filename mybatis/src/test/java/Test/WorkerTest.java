package Test;

import com.rjxy.dao.WorkerMapper;
import com.rjxy.pojo.Worker;
import com.rjxy.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class WorkerTest {
    @Test
    public  void  selectAllTest(){
        SqlSession session = MyBatisUtils.getSession();
        WorkerMapper workerMapper = session.getMapper(WorkerMapper.class);
        List<Worker> list = workerMapper.selectAllWorker();
       for (Worker w:list)
           System.out.println(w.toString());
        session.close();
    }

    @Test
    public void selectTest(){
        SqlSession session = MyBatisUtils.getSession();
        WorkerMapper workerMapper = session.getMapper(WorkerMapper.class);
        Worker worker = workerMapper.selectWorker(1);
        System.out.println(worker.toString());
        session.close();
    }
    @Test
    public void insertTest(){
        SqlSession session = MyBatisUtils.getSession();
        WorkerMapper workerMapper = session.getMapper(WorkerMapper.class);
        Worker worker = new Worker();
        worker.setId(4);
        worker.setName("12");
        worker.setAge(12);
        worker.setSex("男");
        worker.setWorker_id("1004");
        int w = workerMapper.insertWorker(worker);
        session.commit();
        System.out.println(w);
        session.close();
    }
    @Test
    public void updateTest(){
        SqlSession session = MyBatisUtils.getSession();
        WorkerMapper workerMapper = session.getMapper(WorkerMapper.class);
        Worker worker = new Worker();
        worker.setId(6);
        worker.setName("22");
        worker.setAge(12);
        worker.setWorker_id("1004");
        int w = workerMapper.updateWorker(worker);
        session.commit();
        System.out.println(w);
        session.close();
    }
    @Test
    public void delTest(){
        SqlSession session = MyBatisUtils.getSession();
        WorkerMapper workerMapper = session.getMapper(WorkerMapper.class);
        int w = workerMapper.delWorker(6);
        session.commit();
        System.out.println(w);
        session.close();
    }
    @Test
    public void selectWorkerByIdName(){
        SqlSession session = MyBatisUtils.getSession();
        WorkerMapper workerMapper = session.getMapper(WorkerMapper.class);
        Worker w = workerMapper.selectWorkerByIdName(3,"王五");
        System.out.println(w.toString());
        session.close();
    }
}
