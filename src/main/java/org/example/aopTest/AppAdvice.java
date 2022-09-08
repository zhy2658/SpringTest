package org.example.aopTest;

import org.springframework.aop.MethodBeforeAdvice; //方法返回之前实现的类方法
import org.springframework.aop.AfterReturningAdvice; //方法返回之后实现的类方法

import java.lang.reflect.Method;
import java.util.Arrays;

//方法返回之前实现的类方法
public class AppAdvice implements MethodBeforeAdvice{

    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("方法名称 "+method.getName());
        System.out.println("方法参数有 "+ Arrays.toString(args));
        System.out.println("方法执行的对象为："+target);
    }
}
