package com.Medicare.Appointement.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Medicare.Appointement.Dao.AppointementDao;
import com.Medicare.Appointement.Model.Appointement;
import com.Medicare.Patient.Dao.PatientDao;
import com.Medicare.Patient.Model.Patient;

/**
 * Servlet implementation class AddAppointementServlet
 */
@WebServlet("/AddAppointementServlet")
public class AddAppointementServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		 System.out.println("✅ La méthode doGet() a été appelée !");
		    response.getWriter().println("Servlet en cours d'exécution !");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Servlet AddAppointementServlet exécuté !");
		//doGet(request, response);
		
		String username = request.getParameter("username");
		String dateStr = request.getParameter("date"); // Ex: "2025-02-22"
		Date date = Date.valueOf(dateStr); // Convertir String en java.sql.Date
		String heure =  request.getParameter("heure");
		String statut =  request.getParameter("statut");
		String motif = request.getParameter("motif");
		
		Appointement appointement = new Appointement();
		appointement.setUsername(username);
		appointement.setDateDdv(date);
		appointement.setHeure(heure);
		appointement.setStatut(statut);
		appointement.setMotif(motif);
		
		
		System.out.println("Données reçues : username = " +username+ " dateRdv = " + date + ", heure = " + heure + ", statut = " + statut+ ",motif =" +motif );

		AppointementDao appointementDao = new AppointementDao();
		int result = appointementDao.ajouterAppointement(appointement);
		if (result > 0) {
			response.sendRedirect(request.getContextPath() + "/View/Patient/patient.jsp");

		}else {
			PrintWriter out = response.getWriter();
			out.println("Data not added Successfully!!");
		}
		
	}


}
