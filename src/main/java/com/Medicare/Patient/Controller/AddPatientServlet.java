package com.Medicare.Patient.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Medicare.Patient.Dao.PatientDao;
import com.Medicare.Patient.Model.Patient;

/**
 * Servlet implementation class AddPatientServlet
 */
@WebServlet("/AddPatientServlet")
public class AddPatientServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	//	System.out.println("ksghhgkljjhkgfxg");
		// TODO Auto-generated method stub

	response.getWriter().append("Served at: ").append(request.getContextPath());
		 System.out.println("✅ La méthode doGet() a été appelée !");
		    response.getWriter().println("Servlet en cours d'exécution !");
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Servlet AddPatientServlet exécuté !");
		//doGet(request, response);
		
		
		
		String fullname = request.getParameter("fullname");
		String email =  request.getParameter("email");
		String phoneNumber =  request.getParameter("phone");
		
		Patient patient = new Patient();
		
		patient.setFullname(fullname);
		patient.setEmail(email);
		patient.setPhoneNumber(phoneNumber);
		
		System.out.println("Données reçues :  fullname = " + fullname + ", email = " + email + ", phoneNumber = " + phoneNumber);

		PatientDao patientDao = new PatientDao();
		int result = patientDao.ajouterPatient(patient);
		if (result > 0) {
			response.sendRedirect("http://localhost:8087/MediCare/View/Patient/patient.jsp");
		}else {
			PrintWriter out = response.getWriter();
			out.println("Data not added Successfully!!");
		}
		
	}

}
