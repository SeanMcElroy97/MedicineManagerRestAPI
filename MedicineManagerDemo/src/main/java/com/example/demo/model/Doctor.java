package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//Pharmacy may store doctor details
@Entity
public class Doctor {
	
	@Id@GeneratedValue(strategy=GenerationType.IDENTITY)
	int doctorID;
	
	String doctorName;
	String doctorLastName;
	String doctorContactNum;
	String doctorRegNum;
	
	
	
	public int getDoctorID() {
		return doctorID;
	}
	public void setDoctorID(int doctorID) {
		this.doctorID = doctorID;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public String getDoctorLastName() {
		return doctorLastName;
	}
	public void setDoctorLastName(String doctorLastName) {
		this.doctorLastName = doctorLastName;
	}
	public String getDoctorContactNum() {
		return doctorContactNum;
	}
	public void setDoctorContactNum(String doctorContactNum) {
		this.doctorContactNum = doctorContactNum;
	}
	public String getDoctorRegNum() {
		return doctorRegNum;
	}
	public void setDoctorRegNum(String doctorRegNum) {
		this.doctorRegNum = doctorRegNum;
	}
	

}