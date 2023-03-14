package com.it.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

/*
    JDBC驱动控制
 */

//@PropertySource("classpath:jdbc.properties") //读取资源文件
public class JdbcConfig {

    @Value("${mysql.driver}")
    private String driver;
    @Value("${mysql.url}")
    private String url;
    @Value("${ mysql.username}")
    private String username;
    @Value("${ mysql.password}")
    private String password;

//    @Bean("dataSource") //bean注入方法注解
    public DataSource getDataSource(){
        DruidDataSource ds = new DruidDataSource();
        ds.setDriverClassName(driver);
        ds.setUrl(url);
        ds.setUsername(username);
        ds.setPassword(password);
        return ds;
    }

}
