package com.controller;

import com.dao.UserDao;
import com.po.MyUser;
import com.pojo.SelectUserOrdersById;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller("oneToMoreController")
public class OneToMoreController {
    @Autowired
    private UserDao userDao;
    public void test(){
        //查询一个用户及订单信息
        MyUser auser1 = userDao.selectOrdersById1(1);
        System.out.println(auser1);
        System.out.println("=============================");
        MyUser auser2 = userDao.selectOrdersById2(1);
        System.out.println(auser2);
        System.out.println("=============================");
        List<SelectUserOrdersById> auser3 = userDao.selectOrdersById3(1);
        System.out.println(auser3);
        System.out.println("=============================");
    }
}
