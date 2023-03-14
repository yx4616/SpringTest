package com.it.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.config.MapperScannerBeanDefinitionParser;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;
/*
    mybatis配置类
 */
public class MybatisConfig {

    //新建数据库会话工厂 注入数据源
//    @Bean
    public SqlSessionFactoryBean getSqlSessionFactoryBean(@Autowired DataSource dataSource){
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        return sqlSessionFactoryBean;
    }

    //mybatis映射扫描
//    @Bean
    public MapperScannerConfigurer getMapperScannerBeanDefinitionParser(){
        MapperScannerConfigurer msc = new MapperScannerConfigurer();
        msc.setBasePackage("com.it.dao");
        return msc;
    }
}
