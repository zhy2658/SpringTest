package org.example.aopTest;

import lombok.extern.java.Log;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

import java.util.Arrays;

@Log
public class AppTest {

    public void before(){
        log.info("我是方法执行之前的日志！");
    }


    public void after(JoinPoint point){
        System.out.println(Arrays.toString(point.getArgs()));
        log.info("我是方法执行之后日志");
    }
    public void around(ProceedingJoinPoint join) throws Throwable {
        join.proceed();
       log.info("我是环绕方法");
    }

}
