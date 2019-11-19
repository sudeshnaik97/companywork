package com.lti.package1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("sp")
public class SpellChecker {

	
	public void checkSpellingMistake(String name)
	{
		System.out.println(" Spell Checker executed for : " +name);
	}
}
