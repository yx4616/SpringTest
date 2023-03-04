package com.it;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Component("student")
public class Student {
    @Value(("${studentName}"))
    private String id;
    @Value(("${studentAge}"))
    private String name;
    @Resource
    private School school;

//    @PostConstruct
//    public void  init(){
//        System.out.println("Bean生成");
//    }

//    @PreDestroy
//    public  void destroy(){
//        System.out.println("销毁");
//    }
}
