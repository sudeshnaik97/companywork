package com.lti.component;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ctx= new ClassPathXmlApplicationContext("spring-db.xml");
		CarPartsInventory cp= (CarPartsInventory) ctx.getBean("cpl3");
		
		CarPart c= new CarPart();
		c.setPartno(109);
		c.setPartname("tail light");
		c.setCarmodel("top");
		c.setQuantity(1036);
		c.setPrice(1000);
		cp.addNewPart(c);
		
		List<CarPart> cl= cp.getAvailableParts();
		
		for (CarPart carPart : cl) {
			System.out.println(carPart.getCarmodel());
			System.out.println(carPart.getPartname());
			System.out.println(carPart.getPartno());
			System.out.println(carPart.getPrice());
			
		}
		
	}

	
}
