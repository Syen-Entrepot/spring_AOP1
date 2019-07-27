package com.cn;

import com.cn.advice.BadBaby;
import com.cn.pojo.HelloBay;
import com.cn.pojo.HelloGoodBaby;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Syen
 * @date 2019/7/27 0027-下午 17:05
 */
public class TestAop {
    @Test
    public void m1(){
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        HelloBay helloBay= context.getBean("helloBay",HelloBay.class);
        HelloGoodBaby helloGoodBaby= context.getBean("helloGoodBaby",HelloGoodBaby.class);
        BadBaby badBaby= context.getBean("badBaby",BadBaby.class);
        // helloBay.show();
        // helloGoodBaby.show();
        badBaby.show();


    }
    @Test
    public void m2(){
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");

        BadBaby badBaby= context.getBean("badBaby",BadBaby.class);

        badBaby.eat("卫龙辣条");


    }
    @Test
    public void m3(){
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");

        BadBaby badBaby= context.getBean("badBaby",BadBaby.class);

        badBaby.star();


    }
    @Test
    public void m_throw(){
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");

        BadBaby badBaby= context.getBean("badBaby",BadBaby.class);

        badBaby.throwMethod("不妙!!");


    }
    @Test
    public void m_Around(){
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");

        BadBaby badBaby= context.getBean("badBaby",BadBaby.class);

        badBaby.throwMethod("不妙!!");


    }
}
