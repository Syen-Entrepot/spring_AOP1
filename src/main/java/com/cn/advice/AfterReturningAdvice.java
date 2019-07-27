package com.cn.advice;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @author Syen
 * @date 2019/7/27 0027-下午 17:57
 */
@Aspect
@Component

public class AfterReturningAdvice {

    @AfterReturning(value = "execution(* com.cn.advice.BadBaby.star())",returning = "returning")
    public void afterReturning(String returning){
     System.out.println("返回值为：AfterReturning....."+returning);
    }


}
