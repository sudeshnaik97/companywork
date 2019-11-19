package com.lti.component;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;





/*
 * Hibernate And Spring in JDBC
 */
@Component("cpl4")
public class CarPartInventoryIMPL4 implements CarPartsInventory {
//@AutoWIRED doesnt work for injecting Entity manger abject
	@PersistenceContext
	private EntityManager entityManager;
	@Transactional
	public void addNewPart(CarPart carPart) {
		entityManager.persist(carPart);
		
	
	}



public List<CarPart> getAvailableParts() {
	
	Query q=entityManager.createQuery("select c from CarPart as c  ");
	
	return q.getResultList();
	}
}