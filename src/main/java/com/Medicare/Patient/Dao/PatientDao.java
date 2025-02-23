package com.Medicare.Patient.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.Medicare.DataBaseConnection;
import com.Medicare.Patient.Model.Patient;

public class PatientDao {
	
	
	
	
	// Méthode pour ajouter un patient
    public int ajouterPatient(Patient patient) {
    	int result = 0;
        String query = "INSERT INTO patient (fullname, email, phoneNumber) VALUES ( ?, ?, ?)";
        try {
        	Connection connection = DataBaseConnection.getConnection();
        	if(connection == null) {
        		System.out.println("database not connected!!");
        	    return 0; // Arrêter ici si la connexion est nulle
        	} else {
        	    System.out.println("Connexion réussie à la base de données !");
        	}
            PreparedStatement ps = connection.prepareStatement(query);
            	
   
            ps.setString(1, patient.getFullname());
            ps.setString(2, patient.getEmail());
            ps.setString(3, patient.getPhoneNumber());
        
           result = ps.executeUpdate();
           System.out.println("Nombre de lignes insérées : " + result);
            // Retourne `1` si l'insertion a réussi
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result; // Retourne `0` en cas d'échec
    }
    
    
    	
	

}
