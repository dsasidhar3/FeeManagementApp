package com.sashi.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sashi.dao.AccountantDao;

/**
 * Servlet implementation class InsertAccountant
 */
@WebServlet("/InsertAccountant")
public class InsertAccountant extends HttpServlet {
	public void service(HttpServletRequest x, HttpServletResponse y) {
		String id=x.getParameter("id");
		String name=x.getParameter("name");
		String email=x.getParameter("email");
		String password=x.getParameter("password");
		String place=x.getParameter("place");
		String contact=x.getParameter("contact");
		
		AccountantDao ad=new AccountantDao();
		
		ad.addAccountant(id, name, email, password, place, contact);
		
		try {
			PrintWriter pw= y.getWriter();
			pw.println("Accountant was added successfully");
		} 
		catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
	}

}
