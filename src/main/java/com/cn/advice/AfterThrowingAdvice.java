package com.cn.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @author Syen
 * @date 2019/7/27 0027-下午 18:09
 */
@Aspect
@Component
public class AfterThrowingAdvice {

    @AfterThrowing(value = "execution(* com.cn.advice.BadBaby.throwMethod())",throwing = "throwMsg")
    public void throwing(JoinPoint joinPoint,String throwMsg){

       System.out.println("异常之后:"+joinPoint.getSignature().getName());
       System.out.println("异常信息:"+throwMsg);


    }


}
