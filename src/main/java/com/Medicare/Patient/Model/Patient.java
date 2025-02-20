package com.Medicare.Patient.Model;

public class Patient {
	int idPatient ;
	String userName;
	String email;
	String phoneNumber;




public Patient (int idPatient , String userName , String email ,String phoneNumber) {
	this.idPatient =idPatient; 
	this.userName = userName; 
	this.email =email; 
	this.phoneNumber =phoneNumber; 
	
}

public Patient (String userName , String email ,String phoneNumber) { 
	this.userName = userName; 
	this.email =email; 
	this.phoneNumber =phoneNumber; 
	
}

public int getIdPatient() {
	return idPatient;
}

public void setIdPatient(int idPatient) {
	this.idPatient = idPatient;
}

public String getUserName() {
	return userName;
}

public void setUserName(String userName) {
	this.userName = userName;
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



}