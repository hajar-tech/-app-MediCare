package com.Medicare.Patient.Controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Medicare.Appointement.Dao.AppointementDao;
import com.Medicare.Appointement.Model.Appointement;

@WebServlet("/RendezVousServlet")
public class RendezVousServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
    
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	//	System.out.println("ksghhgkljjhkgfxg");
    		// TODO Auto-generated method stub

    	response.getWriter().append("Served at: ").append(request.getContextPath());
    		 System.out.println("✅ La méthode doGet() a été appelée !");
    		    response.getWriter().println("Servlet en cours d'exécution !");
    		
    		
    	}
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        
        AppointementDao appointementDao = new AppointementDao();
        
        // Vérification du username
        if (appointementDao.isUsernameExist(username)) {
            // Si le username existe, récupérer les rendez-vous associés
            ArrayList<Appointement> appointements = appointementDao.getRendezVousByUsername(username);
            RequestDispatcher dispatcher = request.getRequestDispatcher("/View/Patient/list-rvs-patient.jsp");
    		request.setAttribute("appointements", appointements);
    		dispatcher.forward(request, response);
            //request.setAttribute("appointements", appointements);
            //request.getRequestDispatcher("/View/Patient/list-rvs-patient.jsp").forward(request, response);
        } else {
            // Si le username n'existe pas, rediriger ou afficher un message d'erreur
            request.setAttribute("errorMessage", "Le username n'existe pas.");
            request.getRequestDispatcher("/View/Patient/username.jsp").forward(request, response);
        }
    }
}
