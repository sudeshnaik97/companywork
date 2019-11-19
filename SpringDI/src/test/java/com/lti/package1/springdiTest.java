package com.lti.package1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class springdiTest {

	public static void main(String args[])
	{
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring-diconfig.xml");
		Car c=(Car) ctx.getBean("kar");
		c.playsomeMusic();
	}
}
