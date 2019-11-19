package com.lti.package1;

import org.springframework.stereotype.Component;

@Component("iciciBank")
public class IciciBank implements BankINTF {

	public double deductAmount(double amt) {
		// TODO Auto-generated method stub
		return amt;
	}

	public String Communicate(String name) {
		// TODO Auto-generated method stub
		return name;
	}

}
