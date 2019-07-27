package com.cn.advice;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author Syen
 * @date 2019/7/27 0027-下午 16:56
 */


@Order(100)
@Aspect//标记其为一个切面
@Component//标记当前这个类为spring的一个组件,相当于在xml注册了一个bean一样
public class BeforeAdvice {


       @Before("execution(* com..*.*.*(..))")
       public void before(){
           System.out.println("在一个世纪以前.....");
       }


}
