package com.ti.component1;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="AppointmentDate")
public class Appointmentdate {
	
	private LocalDate apptDate;
	private LocalTime apptTime;
	private String location;
	@OneToOne(mappedBy="custdetails")
	private DocumentsUpload docupload;
	public LocalDate getApptDate() {
		return apptDate;
	}
	public void setApptDate(LocalDate apptDate) {
		this.apptDate = apptDate;
	}
	public LocalTime getApptTime() {
		return apptTime;
	}
	public void setApptTime(LocalTime apptTime) {
		this.apptTime = apptTime;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public DocumentsUpload getDocupload() {
		return docupload;
	}
	public void setDocupload(DocumentsUpload docupload) {
		this.docupload = docupload;
	}
	
}
