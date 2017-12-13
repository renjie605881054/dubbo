package com.dubbo_client;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dubbo_server.service.DemoService;

public class MyClient {  
    public void sayHello(){  
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(  
                new String[] { "applicationConsumer.xml" });  
  
        context.start();  
  
        //获取服务器那边的bean  
        DemoService demoService = (DemoService) context.getBean("demoService");  
  
        System.out.println(demoService.login("lisi"));  
    }  
}
