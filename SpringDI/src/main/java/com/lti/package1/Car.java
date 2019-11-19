package com.lti.package1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component("kar")
public class Car {

	@Autowired      //Introduces DI
	private AudioSystem audioSystem;
	
	public void playsomeMusic(){ 
		
		 audioSystem.playFM(93.5);		//calling the method from AudioSystem class
	}
	
	

}
