package com.lti.package1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("sbiATM")
public class SBIAtm implements ATM  {
	
	@Autowired
	private BankINTF bank;
	public void withdraw(double amt)
	{
		System.out.println("Money Withdrawn: "+amt);
		bank.Communicate("Hello");
	}
	}
