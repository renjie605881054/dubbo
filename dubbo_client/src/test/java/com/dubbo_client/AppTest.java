package com.dubbo_client;

import java.io.IOException;

import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
public class AppTest 
 
{
	 public static void main(String[] args) throws IOException {  
	        MyClient myClient = new MyClient();  
	        myClient.sayHello();  
	        System.in.read();
	    }  
}
