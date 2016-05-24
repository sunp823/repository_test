package com.service.consumer;

import com.service.provider.*;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by hzsunpeng on 2016/5/20.
 */
public class TestMng {

     private TestDubbo testDubbo;

     public TestDubbo getTestDubbo() {
       return testDubbo;
     }

    public void setTestDubbo(TestDubbo testDubbo)
    {
        this.testDubbo = testDubbo;
    }

    public String getStr(){
        if(testDubbo==null)
            return "";
        return testDubbo.getStr();
    }
}
