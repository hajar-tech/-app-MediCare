package com.Medicare;

import java.sql.Connection;

public class TestDataConnetion {

	
	
	
	    public static void main(String[] args) {
	        Connection conn = DataBaseConnection.getConnection();
	        
	        if (DataBaseConnection.isConnectionValid()) {
	            System.out.println("✅ Connexion à la base de données valide !");
	        } else {
	            System.out.println("❌ Échec de connexion à la base de données !");
	        }
	    }
	    
	
}
