package com.zhl;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author ZHL
 * @Description TODO
 * @ClassName Consumer
 * @Date 2019/7/28 0028 16:51
 * @Version 1.0
 */
public class Consumer {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"consumer.xml"});
        context.start();
        DemoService demoService = (DemoService)context.getBean("demoService"); // 获取远程服务代理
        String hello = demoService.sayHello("World"); // 执行远程方法
        System.out.println(hello); // 显示调用结果
    }
}
