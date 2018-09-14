package com.sashi.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sashi.dao.*;

/**
 * Servlet implementation class DeletingStudent
 */
@WebServlet("/DeletingStudent")
public class DeletingStudent extends HttpServlet {
	public void service(HttpServletRequest x,HttpServletResponse y) {
		String rollnum=x.getParameter("rollnum");
		
		StudentDao ad=new StudentDao();
		
		ad.delStudent(rollnum);
		
		try {
			PrintWriter pw=y.getWriter();
			pw.println("Student was deleted Successfully");
			
		} 
		catch (IOException e) {
			
			e.printStackTrace();
		}
	}

}
