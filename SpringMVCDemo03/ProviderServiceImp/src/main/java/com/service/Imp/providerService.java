package com.service.Imp;


import com.service.provider.TestDubbo;

/**
 * Created by hzsunpeng on 2016/5/22.
 */
public class providerService implements TestDubbo{

    public String getStr() {
        return "test:";
    }
}
