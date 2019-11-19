package com.lti.component;

import java.util.List;

import org.springframework.stereotype.Component;

public interface CarPartsInventory {
	 
	public void addNewPart(CarPart carPart ); 
	public List<CarPart> getAvailableParts();
		
	
	

}
