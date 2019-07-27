package com.cn.advice;

import org.springframework.stereotype.Component;

/**
 * @author Syen
 * @date 2019/7/27 0027-下午 17:15
 */
@Component
public class BadBaby {

    public void show(){
        System.out.println("一岁一枯荣.....");
    }
    public void eat(String msg){
        System.out.println("吃辣条....."+msg);
    }
    public String star(){
        System.out.println("吃辣条..AfterReturning");
        return "林志高";
    }
    public void throwMethod(String throwMsg){
        System.out.println("hello:异常！");


        throw new RuntimeException("狼来了......"+throwMsg);



    }

}
