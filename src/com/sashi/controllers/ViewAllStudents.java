package com.sashi.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ViewAllAccountants
 */
@WebServlet("/ViewAllStudents")
public class ViewAllStudents extends HttpServlet {
	public void service(HttpServletRequest x, HttpServletResponse y) {
		try {
			x.getRequestDispatcher("ViewAllStudents.jsp").forward(x, y);
		} 
		catch (ServletException | IOException e) {
			
			e.printStackTrace();
		}
	}

}
