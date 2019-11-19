package com.ti.component1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Documentsupload")
public class DocumentsUpload {

	private String pan;
	private String votersId;
	private String salaryslip;
	private String loa;
	private String noc;
	@Column(name="AgreementToSale")
	private String aggrTosale;
	
	
	public String getPan() {
		return pan;
	}
	public void setPan(String pan) {
		this.pan = pan;
	}
	public String getVotersId() {
		return votersId;
	}
	public void setVotersId(String votersId) {
		this.votersId = votersId;
	}
	public String getSalaryslip() {
		return salaryslip;
	}
	public void setSalaryslip(String salaryslip) {
		this.salaryslip = salaryslip;
	}
	public String getLoa() {
		return loa;
	}
	public void setLoa(String loa) {
		this.loa = loa;
	}
	public String getNoc() {
		return noc;
	}
	public void setNoc(String noc) {
		this.noc = noc;
	}
	public String getAggrTosale() {
		return aggrTosale;
	}
	public void setAggrTosale(String aggrTosale) {
		this.aggrTosale = aggrTosale;
	}
	

}
