package com.lti.package1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class atmTest {

	public static void main(String[] args) {
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring-diconfig.xml");
		SBIAtm atm=new SBIAtm();
		atm=(SBIAtm) ctx.getBean("sbiATM");
		atm.withdraw(1000);
		//IciciBank icb=new 
		

	}

}
