package com.sashi.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sashi.dao.StudentDao;
import com.sashi.model.StudentBean;

/**
 * Servlet implementation class EditStudentForm
 */
@WebServlet("/EditStudentForm")
public class EditStudentForm extends HttpServlet {
	public void service(HttpServletRequest x,HttpServletResponse y) {
		String rollnum=x.getParameter("rollnum");
		
		StudentDao ad=new StudentDao();
		StudentBean sb=ad.viewStudent(rollnum);
		
		PrintWriter pw;
		try {
			pw = y.getWriter();
			
			pw.println("<!DOCTYPE html>");
			pw.println("<html>");
			pw.println("<head>");
			pw.println("<title>Edit Student Form</title>");
			pw.println("</head>");
			pw.println("<body>");
			pw.println("<h2>Edit the student details below....</h2>");
			pw.println("<form action=\"EditingStudent\">");
			pw.println("<label>ROLL NO:</label><input type=\"hidden\" value="+sb.getRollnum()+" name=\"rollnum\"><br><br>");
			pw.println("<label>NAME:</label><input type=\"text\" value="+sb.getName()+" name=\"name\"><br><br>");
			pw.println("<label>EMAIL:</label><input type=\"text\" value="+sb.getEmail()+" name=\"email\"><br><br>");
			pw.println("<label>GENDER:</label><input type=\"text\" value="+sb.getGender()+" name=\"gender\"><br><br>");
			pw.println("<label>COURSE:</label><input type=\"text\" value="+sb.getCourse()+" name=\"course\"><br><br>");
			pw.println("<label>FEE:</label><input type=\"text\" value="+sb.getFee()+" name=\"fee\"><br><br>");
			pw.println("<label>PAID:</label><input type=\"text\" value="+sb.getPaid()+" name=\"paid\"><br><br>");
			pw.println("<label>DUE:</label><input type=\"text\" value="+sb.getDue()+" name=\"due\"><br><br>");
			pw.println("<label>ADDRESS:</label><input type=\"text\" value="+sb.getAddress()+" name=\"address\"><br><br>");
			pw.println("<label>CONTACT:</label><input type=\\\"text\\\" value="+sb.getContact()+" name=\\\"contact\\\"><br><br>\\");
			pw.println("<input type=\"submit\">");
			pw.println("</form>");
			pw.println("</body>");
			pw.println("</html>");
		} 
		
		catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		
		
		
		
		
	}

}
