package com.Medicare.Patient.Model;

public class Patient {
	int idPatient ;
	
	String fullname;
	String email;
	String phoneNumber;


public Patient () {}

public Patient (int idPatient , String fullname , String email ,String phoneNumber) {
	this.idPatient =idPatient; 
	this.fullname = fullname; 
	this.email =email; 
	this.phoneNumber =phoneNumber; 
	
}

public Patient (String fullname , String email ,String phoneNumber) { 
	this.fullname = fullname; 
	this.email =email; 
	this.phoneNumber =phoneNumber; 
	
}

public int getIdPatient() {
	return idPatient;
}

public void setIdPatient(int idPatient) {
	this.idPatient = idPatient;
}




public String getFullname() {
	return fullname;
}

public void setFullname(String fullname) {
	this.fullname = fullname;
}



public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getPhoneNumber() {
	return phoneNumber;
}

public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
}

@Override
public String toString() {
	return "Patient [fullname=" + fullname + ", email=" + email + ", phoneNumber=" + phoneNumber + "]";
}





}