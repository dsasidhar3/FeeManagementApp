package com.sashi.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ViewAccountant
 */
@WebServlet("/ViewAccountant")
public class ViewAccountant extends HttpServlet {
	public void service(HttpServletRequest x,HttpServletResponse y) {
		
		try {
			x.getRequestDispatcher("AccountantId.jsp").forward(x, y);
		} 
		catch (Exception e) {
			
			e.printStackTrace();
		}
	}

}
