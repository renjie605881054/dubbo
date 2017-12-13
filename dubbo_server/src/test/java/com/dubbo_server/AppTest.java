package com.dubbo_server;

import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Unit test for simple App.
 */
public class AppTest {
	public static void main(String[] args) throws Exception {  
	    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(  
	            new String[] { "applicationProvider.xml" });  
	
	    context.start();  
	    System.out.println("按任意键退出");  
	    System.in.read();   
	
	}  
}
