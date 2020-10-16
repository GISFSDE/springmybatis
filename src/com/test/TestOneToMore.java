package com.test;

import com.controller.OneToMoreController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestOneToMore {
    public static void main(String[] args) {
        ApplicationContext appcon = new ClassPathXmlApplicationContext("applicationContext.xml");
        OneToMoreController otm = (OneToMoreController)appcon.getBean("oneToMoreController");
        otm.test();
    }
}
