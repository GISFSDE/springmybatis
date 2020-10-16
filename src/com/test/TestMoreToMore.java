package com.test;

import com.controller.MoreToMoreController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class TestMoreToMore {
    public static void main(String[] args) {
        ApplicationContext appcon = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
        MoreToMoreController otm = (MoreToMoreController) appcon
                .getBean("moreToMoreController");
        otm.test();
    }
}
