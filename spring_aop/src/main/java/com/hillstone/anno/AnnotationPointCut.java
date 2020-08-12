package com.hillstone.anno;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

//方式三：使用注解方式实现AOP
@Aspect  //标注这个类是一个切面
public class AnnotationPointCut {

    @Before("execution(* com.hillstone.service.UserServiceImpl.*(..))")
    public void before() {
        System.out.println("=====方法执行前=======");
    }

    @After("execution(* com.hillstone.service.UserServiceImpl.*(..))")
    public void after() {
        System.out.println("=====方法执行后=======");
    }

    //在环绕增强中，我们可以给定一个参数，代表我们要获取切入点
    @Around("execution(* com.hillstone.service.UserServiceImpl.*(..))")
    public void aroud(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("环绕执行前");
        System.out.println(jp.getSignature());
        Object proceed = jp.proceed();//执行方法
        System.out.println("环绕执行后");
    }
}
