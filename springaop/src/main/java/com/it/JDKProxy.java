package com.it;

import com.it.impl.UserDaoImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JDKProxy implements InvocationHandler {
    private final Object obj;

    public JDKProxy(Object obj) {
        this.obj = obj;
    }

    public Object geProxy() {
        ClassLoader classLoader = obj.getClass().getClassLoader();
        Class<?>[] interfaces = obj.getClass().getInterfaces();
        return Proxy.newProxyInstance(classLoader, interfaces, this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        Aspect aspect = (Aspect) app.getBean("aspect");
//        Aspect aspect = new Aspect();
        aspect.cheak_Permission();
        Object returnValue = method.invoke(obj, args);
        aspect.log();
        return returnValue;
    }
}
