package com.sashi.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.sashi.model.AccountantBean;
import com.sashi.model.StudentBean;

public class StudentDao {	
	public void addStudent(String rollnum,String name,String email, String gender,String course, int fee,int paid,int due,String address,String contact) {
		Connection con=DatabaseConnection.getConnection();
		PreparedStatement pstmt=null;
		
		try {
			pstmt=con.prepareStatement("INSERT INTO STUDENTS VALUES(?,?,?,?,?,?,?,?,?,?)");
			pstmt.setString(1, rollnum);
			pstmt.setString(2, name);
			pstmt.setString(3, email);
			pstmt.setString(4, gender);
			pstmt.setString(5, course);
			pstmt.setInt(6, fee);
			pstmt.setInt(7, paid);
			pstmt.setInt(8, due);
			pstmt.setString(9, address);
			pstmt.setString(10, contact);
			
			
			pstmt.executeUpdate();
		} 
		catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	
	public StudentBean viewStudent(String rollnum) {
		
		Connection con=DatabaseConnection.getConnection();
		PreparedStatement pstmt=null;
		ResultSet res=null;
		StudentBean sb=null;
		
		try {
			pstmt=con.prepareStatement("SELECT * FROM STUDENTS WHERE ROLLNO=?");
			pstmt.setString(1, rollnum);
			res=pstmt.executeQuery();
			
			while(res.next()) {
				String a=res.getString(1);
				String b=res.getString(2);
				String c=res.getString(3);
				String d=res.getString(4);
				String e=res.getString(5);
				int f=res.getInt(6);
				int g=res.getInt(7);
				int h=res.getInt(8);
				String i=res.getString(9);
				String j=res.getString(10);
				
			    sb=new StudentBean(a, b, c, d, e, f, g, h, i, j);
			}
		} 
		catch (SQLException e) {
			
			e.printStackTrace();
		}
		return sb;		
	}
	
	public List viewAllStudents() {
		Connection con=DatabaseConnection.getConnection();
		Statement stmt=null;
		ResultSet res=null;
		StudentBean sb=null;
		List l=new ArrayList();
		
		try {
			stmt=con.createStatement();
			res=stmt.executeQuery("SELECT * FROM STUDENTS");
			
			while(res.next()) {
				String a=res.getString(1);
				String b=res.getString(2);
				String c=res.getString(3);
				String d=res.getString(4);
				String e=res.getString(5);
				int f=res.getInt(6);
				int g=res.getInt(7);
				int h=res.getInt(8);
				String i=res.getString(9);
				String j=res.getString(10);
				
				 sb=new StudentBean(a, b, c, d, e, f, g, h, i, j);
				 
				 l.add(sb);
				 
			}
			
		} 
		catch (SQLException e) {
			
			e.printStackTrace();
		}
		return l;
	}
	
	
	public void delStudent(String rollnum) {
		
		Connection con=DatabaseConnection.getConnection();
		PreparedStatement pstmt=null;
		
		try {
			pstmt=con.prepareStatement("DELETE FROM STUDENTS WHERE ROLLNO=?");
			pstmt.setString(1, rollnum);
			pstmt.executeUpdate();
		} 
		catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}
	
	public List viewDues() {
		Connection con= DatabaseConnection.getConnection();
		PreparedStatement pstmt=null;
		ResultSet res=null;
		List l=new ArrayList();
		try {
			pstmt=con.prepareStatement("SELECT * FROM STUDENTS WHERE DUE!=0");
			res=pstmt.executeQuery();
			
			
			while(res.next()) {
				String a=res.getString(1);
				String b=res.getString(2);
				String c=res.getString(3);
				String d=res.getString(4);
				String e=res.getString(5);
				int f=res.getInt(6);
				int g=res.getInt(7);
				int h=res.getInt(8);
				String i=res.getString(9);
				String j=res.getString(10);
				
				StudentBean sb=new StudentBean(a, b, c, d, e, f, g, h, i, j);
				
				l.add(sb);
			}
						
		} 
		catch (SQLException e) {
			
			e.printStackTrace();
		}
		return l;
		
	}
	
	public void editStudent(String rollnum,String name,String email, String gender,String course, int fee,int paid,int due,String address,String contact) {
		Connection con=DatabaseConnection.getConnection();
		PreparedStatement pstmt=null;
		
		try {
			pstmt=con.prepareStatement("UPDATE STUDENTS SET NAME=?,EMAIL=?,GENDER=?,COURSE=?,FEE=?,PAID=?,DUE=?,ADDRESS=?,CONTACT=? WHERE ROLLNO=?");
			
			pstmt.setString(1, name);
			pstmt.setString(2, email);
			pstmt.setString(3, gender);
			pstmt.setString(4, course);
			pstmt.setInt(5, fee);
			pstmt.setInt(6, paid);
			pstmt.setInt(7, due);
			pstmt.setString(8, address);
			pstmt.setString(9, contact);
			pstmt.setString(10, rollnum);
			
			
			pstmt.executeUpdate();
		} 
		catch (Exception e) {
			
			e.printStackTrace();
		}
	}

}
