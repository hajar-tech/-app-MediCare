package com.Medicare.Appointement.Model;

import java.sql.Date;

public class Appointement {
	
int  idRendezVous ;
String username;
   Date dateDdv;
   String statut;
   String heure;
   String motif;
   int idDoctor;
   int idPatient;
   
   //constructors
   
   public Appointement() {}
   
public Appointement(int idRendezVous, Date dateDdv, String statut, String heure, String motif, int idDoctor,
		int idPatient) {
	super();
	this.idRendezVous = idRendezVous;
	this.dateDdv = dateDdv;
	this.statut = statut;
	this.heure = heure;
	this.motif = motif;
	this.idDoctor = idDoctor;
	this.idPatient = idPatient;
}


public Appointement(Date dateDdv, String statut, String heure, String motif, int idDoctor, int idPatient) {
	super();
	this.dateDdv = dateDdv;
	this.statut = statut;
	this.heure = heure;
	this.motif = motif;
	this.idDoctor = idDoctor;
	this.idPatient = idPatient;
}


//getters and setters

public int getIdRendezVous() {
	return idRendezVous;
}


public void setIdRendezVous(int idRendezVous) {
	this.idRendezVous = idRendezVous;
}






public String getUsername() {
	return username;
}

public void setUsername(String username) {
	this.username = username;
}

public Date getDateDdv() {
	return dateDdv;
}

public void setDateDdv(Date dateDdv) {
	this.dateDdv = dateDdv;
}

public String getStatut() {
	return statut;
}


public void setStatut(String statut) {
	this.statut = statut;
}


public String getHeure() {
	return heure;
}


public void setHeure(String heure) {
	this.heure = heure;
}


public String getMotif() {
	return motif;
}


public void setMotif(String motif) {
	this.motif = motif;
}


public int getIdDoctor() {
	return idDoctor;
}


public void setIdDoctor(int idDoctor) {
	this.idDoctor = idDoctor;
}


public int getIdPatient() {
	return idPatient;
}


public void setIdPatient(int idPatient) {
	this.idPatient = idPatient;
}  
   
   
   
   
}
