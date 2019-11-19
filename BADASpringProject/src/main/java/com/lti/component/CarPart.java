package com.lti.component;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="TBL_CARPARTS")
public class CarPart  {
	@Id
	@Column(name="PARTNO")
	private int partno;
	@Column(name="PARTNAME")
	private String partname;
	@Column(name="CARMODEL")
	private String Carmodel;
	@Column(name="QUANTITY")
	private int quantity;
	@Column(name="PRICE")
	private double price;
	
	
	public String getPartname() {
		return partname;
	}
	public void setPartname(String partname) {
		this.partname = partname;
	}
	public int getPartno() {
		return partno;
	}
	public void setPartno(int partno) {
		this.partno = partno;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getCarmodel() {
		return Carmodel;
	}
	public void setCarmodel(String carmodel) {
		Carmodel = carmodel;
	}
	
	@Override
	public String toString() {
		return "CarPart [partname=" + partname + ", partno=" + partno + ", quantity=" + quantity + ", price=" + price
				+ ", Carmodel=" + Carmodel + "]";
	}
	
	
}
