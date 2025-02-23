package com.Medicare.Appointement.Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Medicare.Appointement.Dao.AppointementDao;
import com.Medicare.Appointement.Model.Appointement;

/**
 * Servlet implementation class DislpayAppointement
 */
@WebServlet("/DislpayAppointement")
public class DislpayAppointement extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Appointement> appointements = AppointementDao.getAllAppointement() ;
		RequestDispatcher dispatcher = request.getRequestDispatcher("/View/Doctor/list-rvs-doctor.jsp");
		request.setAttribute("data", appointements);
		dispatcher.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
