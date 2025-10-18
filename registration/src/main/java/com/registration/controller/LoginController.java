package com.registration.controller;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import loginModel.DAOService;
import loginModel.DAOServiceImpl;


@WebServlet("/verifyLogin")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public LoginController() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		DAOService service= new DAOServiceImpl();
		service.connectionDB();
		
		boolean status=service.loginCredentials(email, password);
		
		
		if(status==true)
		{
			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/VIEWS/new_registration.jsp");
			rd.forward(request, response);
			
		}else
		{
			request.setAttribute("error", "invalid username/password");
			RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
			rd.forward(request, response);
			
		}
		
		
		
	}

}

