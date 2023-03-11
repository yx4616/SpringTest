package com.rjxy.dao;

import com.rjxy.pojo.Worker;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface WorkerMapper {
    @Select("select * from tb_worker")
    List<Worker> selectAllWorker();

    @Select("select * from tb_worker where id = #{id}")
    Worker selectWorker(int id);

    @Insert("insert into tb_worker(name,age,sex,worker_id) values(#{name},#{age},#{sex},#{worker_id})")
    int insertWorker(Worker worker);

    @Update("update tb_worker set name = #{name},age=#{age} where id = #{id}")
    int updateWorker(Worker worker);

    @Delete("delete from tb_worker where id = #{id}")
    int delWorker(int id);

    @Select("select * from tb_worker where id = #{param1} and name = #{param2}")
    Worker selectWorkerByIdName(@Param("param1") int id, @Param("param2") String name);
}
