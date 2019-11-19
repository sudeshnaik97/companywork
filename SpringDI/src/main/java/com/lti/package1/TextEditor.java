package com.lti.package1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("txt")
public class TextEditor {
	
@Autowired
private SpellChecker spl;
		public void load(String document){
			
			System.out.println("load this document: " + document);
			spl.checkSpellingMistake(document);
		}
}
