package com.hillstone.log;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class log implements MethodBeforeAdvice {

    /*
    method ：要执行的目标对象的方法
    args：  参数
    target：
    */
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println(method.getClass().getName() + "的" + method.getName() + "被执行了");
    }
}
