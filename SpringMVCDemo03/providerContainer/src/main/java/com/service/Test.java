package com.service;

import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Created by hzsunpeng on 2016/5/23.
 */
public class Test{

    public static void main(String args[]) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"applicationContext_dubbo-provider.xml"});
        context.start();
        System.out.println("Provider Processing");
        System.in.read(); //保证服务一直开着
    }
}
