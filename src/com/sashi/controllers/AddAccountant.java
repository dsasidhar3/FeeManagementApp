package com.sashi.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddAccountant
 */
@WebServlet("/AddAccountant")
public class AddAccountant extends HttpServlet {
	public void service(HttpServletRequest x,HttpServletResponse y) {
		try {
			x.getRequestDispatcher("AddAccountant.jsp").forward(x, y);
		} 
		catch (Exception e) {
			
			e.printStackTrace();
		}
	}

}
