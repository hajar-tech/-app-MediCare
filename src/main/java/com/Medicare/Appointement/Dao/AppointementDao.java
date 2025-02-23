package com.Medicare.Appointement.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.Medicare.DataBaseConnection;
import com.Medicare.Appointement.Model.Appointement;



public class AppointementDao {
	
	
	// Méthode pour ajouter un patient
    public int ajouterAppointement(Appointement appointement) {
    	int result = 0;
        String query = "INSERT INTO appointment (username, dateDdv,  heure, statut, motif) VALUES (?, ?, ?,?, ?)";
        try {
        	Connection connection = DataBaseConnection.getConnection();
        	if(connection == null) {
        		System.out.println("database not connected!!");
        	    return 0; // Arrêter ici si la connexion est nulle
        	} else {
        	    System.out.println("Connexion réussie à la base de données !");
        	}
            PreparedStatement pst = connection.prepareStatement(query);
            
            pst.setString(1, appointement.getUsername());
            pst.setDate(2, appointement.getDateDdv());
            pst.setString(3, appointement.getHeure());
            pst.setString(4, appointement.getStatut());
            pst.setString(5, appointement.getMotif());
        
           result = pst.executeUpdate();
           System.out.println("Nombre de lignes insérées : " + result);
            // Retourne `1` si l'insertion a réussi
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result; // Retourne `0` en cas d'échec
    }
    
    
    public static ArrayList<Appointement> getAllAppointement (){
    	ArrayList <Appointement> appointements = new ArrayList<Appointement>();
    	
    	try {
    		Connection connection = DataBaseConnection.getConnection();
    		
    		Statement smt = connection.createStatement();
    		ResultSet rs = smt.executeQuery("select username , dateDdv, heure, statut, motif from appointment");
    		while(rs.next()) {
    			Appointement appointement = new Appointement();
    			appointement.setUsername(rs.getString("username"));
    			appointement.setDateDdv(rs.getDate("dateDdv"));
    			appointement.setHeure(rs.getString("heure"));
    			appointement.setStatut(rs.getString("statut"));
    			appointement.setMotif(rs.getString("motif"));
    			appointements.add(appointement); 

    		}
    	}catch(Exception e) {
            e.printStackTrace();
        }
    	
    	
    	return appointements;
    	
    }
    
    
    
 // Méthode pour récupérer tous les rendez-vous associés à un username
    public ArrayList<Appointement> getRendezVousByUsername(String username) {
        ArrayList<Appointement> appointements = new ArrayList<Appointement>();
        
        try {
            Connection connection = DataBaseConnection.getConnection();
            String query = "SELECT * FROM appointment WHERE usermame = ?";
            PreparedStatement pst = connection.prepareStatement(query);
            pst.setString(1, username);
            ResultSet rs = pst.executeQuery();
            
            while(rs.next()) {
                Appointement appointement = new Appointement();
                appointement.setUsername(rs.getString("username"));
                appointement.setDateDdv(rs.getDate("dateDdv"));
                appointement.setHeure(rs.getString("heure"));
                appointement.setStatut(rs.getString("statut"));
                appointement.setMotif(rs.getString("motif"));
                appointements.add(appointement);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return appointements;
    }
    
    // Méthode pour vérifier si le username existe
    public boolean isUsernameExist(String username) {
        boolean exists = false;
        
        try {
            Connection connection = DataBaseConnection.getConnection();
            String query = "SELECT 1 FROM appointment WHERE username = ?";
            PreparedStatement pst = connection.prepareStatement(query);
            pst.setString(1, username);
            ResultSet rs = pst.executeQuery();
            
            if (rs.next()) {
                exists = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return exists;
    }

}
