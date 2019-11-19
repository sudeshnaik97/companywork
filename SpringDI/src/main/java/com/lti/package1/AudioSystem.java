package com.lti.package1;

import org.springframework.stereotype.Component;


@Component("Radio")
public class AudioSystem {
	public void playFM(double frequency){
		System.out.println("Mirchi sunne wale always khush" + frequency);
	}
}
