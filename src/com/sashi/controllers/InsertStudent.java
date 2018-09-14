package com.sashi.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sashi.dao.StudentDao;

/**
 * Servlet implementation class InsertStudent
 */
@WebServlet("/InsertStudent")
public class InsertStudent extends HttpServlet {
	public void service(HttpServletRequest x,HttpServletResponse y) {
		String rollnum=x.getParameter("rollnum");
		String name=x.getParameter("name");
		String email=x.getParameter("email");
		String gender=x.getParameter("gender");
		String course=x.getParameter("course");
		String fee=x.getParameter("fee");
		String paid=x.getParameter("paid");
		String due=x.getParameter("due");
		String address=x.getParameter("address");
		String contact=x.getParameter("contact");
		
		int f=Integer.parseInt(fee);
		int p=Integer.parseInt(paid);
		int d=Integer.parseInt(due);
		
		StudentDao sd=new StudentDao();
		sd.addStudent(rollnum, name, email, gender, course, f, p, d, address, contact);
		
		try {
			PrintWriter pw=y.getWriter();
			pw.println("Student was added successfully");
		} 
		catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		
	}

}
