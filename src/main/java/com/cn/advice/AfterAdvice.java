package com.cn.advice;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @author Syen
 * @date 2019/7/27 0027-下午 17:35
 */

/*springAop只能在运行期织入，如果要实现的功能不是特别强，用springAop就够了*/
    @Aspect
    @Component
public class AfterAdvice {

        @After("execution(* com.cn.advice.BadBaby.eat(java.lang.String))")
     public void after(){
      System.out.println("吃辣条后，擦嘴。。。");
     }

}
