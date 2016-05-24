package com.service.consumer;

import javax.annotation.Resource;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.alibaba.dubbo.config.annotation.Reference;
import com.service.provider.*;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by hzsunpeng on 2016/5/20.
 */

@Controller
@RequestMapping(value = "/")
public class TestController {
    @Resource
    private TestMng testmng;

    @RequestMapping("/test")
    @ResponseBody   //标注为返回java对象
    public String testDo(HttpServletRequest hsrq){
        StringBuffer str = new StringBuffer();
        str.append("test");

        str.append(testmng.getStr());
        return str.toString();
    }

    @RequestMapping("/test2")
    public String test2(HttpServletRequest hsrq){
        StringBuffer str = new StringBuffer();
        str.append("test");

        str.append(testmng.getStr());
        return str.toString();
    }
    @RequestMapping("index")
    public ModelAndView index()
    {
        //将页面渲染到jsp中
        ModelAndView modelAndView = new ModelAndView("home");
        return modelAndView;
    }
    @RequestMapping("/")
    public ModelAndView welcome()
    {
        ModelAndView modelAndView = new ModelAndView("index");
        return modelAndView;
    }
}
