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
 * Servlet implementation class DeletingAccountant
 */
@WebServlet("/DeletingAccountant")
public class DeletingAccountant extends HttpServlet {
	public void service(HttpServletRequest x,HttpServletResponse y) {
		String id=x.getParameter("id");
		
		AccountantDao ad=new AccountantDao();
		
		ad.delAccountant(id);
		
		try {
			PrintWriter pw=y.getWriter();
			pw.println("Accountant was deleted Successfully");
			
		} 
		catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	

}
