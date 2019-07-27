package com.cn.advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @author Syen
 * @date 2019/7/27 0027-下午 18:37
 */
@Component
@Aspect
public class AroundAdvice {


    @Around("execution(* com.cn.advice.*.*(..))")
    public Object around(ProceedingJoinPoint proceedingJoinPoint)throws Throwable{
    System.out.println("环绕........");
     Object p= proceedingJoinPoint.proceed();
        return p;
    }

}
