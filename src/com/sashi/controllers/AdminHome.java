package com.sashi.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AdminHome
 */
@WebServlet("/AdminHome")
public class AdminHome extends HttpServlet {
	public void service(HttpServletRequest x,HttpServletResponse y) {
		
		String email=x.getParameter("email");
		String password=x.getParameter("password");
		
		if(email.equals("dsasidhar3@gmail.com")&&password.equals("Sashi@007")) {
			try {
				x.getRequestDispatcher("AdminHome.jsp").forward(x, y);
			} 
			catch (Exception e) {
				
				e.printStackTrace();
			}
		}
		else {
			try {
				
				x.getRequestDispatcher("ErrorHome.jsp").forward(x, y);
			} 
			catch (Exception e) {
				
				e.printStackTrace();
			}
			
		}
		
		
		
		
		
		
	} 

}
