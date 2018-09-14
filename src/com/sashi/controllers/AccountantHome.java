package com.sashi.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sashi.dao.AccountantDao;

/**
 * Servlet implementation class AccountantHome
 */
@WebServlet("/AccountantHome")
public class AccountantHome extends HttpServlet {
	public void service(HttpServletRequest x,HttpServletResponse y) {

		
		String email=x.getParameter("email");
		String password=x.getParameter("password");
		
		boolean status=AccountantDao.validateAccountant(email, password);
		
		if(status==true) {
			try {
				x.getRequestDispatcher("AccountantHome.jsp").forward(x, y);
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
