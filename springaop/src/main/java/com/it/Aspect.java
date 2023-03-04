package com.it;

import org.springframework.stereotype.Component;

@Component
public class Aspect {
    public void cheak_Permission(){
        System.out.println("模拟检查");
    }
    public void log(){
        System.out.println("日志功能");
    }
}
