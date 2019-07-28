package com.zhl.service;


import com.zhl.DemoService;

public class DemoServiceImpl implements DemoService {
    public String sayHello(String name) {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Hello " + name;
    }
}