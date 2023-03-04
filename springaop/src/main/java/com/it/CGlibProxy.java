package com.it;




import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.Method;

public class CGlibProxy implements MethodInterceptor {

    private Object obj;
    public CGlibProxy(Object obj) {
        this.obj = obj;
    }

    public Object getProxy(){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(obj.getClass());
        enhancer.setCallback(this);
        Object proxy = enhancer.create();
        return proxy;
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        Aspect aspect = (Aspect) app.getBean("aspect");
//        Aspect aspect = new Aspect();
        aspect.cheak_Permission();
        Object returnValue = method.invoke(obj, objects);
        aspect.log();
        return returnValue;
    }
}

