package com.sashi.dao;

import java.sql.*;
import java.util.*;

import com.sashi.model.AccountantBean;

public class AccountantDao {
	
	public void addAccountant(String id,String name,String email, String password,String place,String contact) {
		Connection con=DatabaseConnection.getConnection();
		PreparedStatement pstmt=null;
		
		try {
			pstmt=con.prepareStatement("INSERT INTO ACCOUNTANTS VALUES(?,?,?,?,?,?)");
			pstmt.setString(1, id);
			pstmt.setString(2, name);
			pstmt.setString(3, email);
			pstmt.setString(4, password);
			pstmt.setString(5, place);
			pstmt.setString(6, contact);
			
			pstmt.executeUpdate();
		} 
		catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	
	
	public AccountantBean ViewAccountant(String id) {
		
		Connection con=DatabaseConnection.getConnection();
		PreparedStatement pstmt =null;
		ResultSet res=null;
		AccountantBean ab = null;
		
		try {
			pstmt=con.prepareStatement("SELECT * FROM ACCOUNTANTS WHERE ID=?");
			
			pstmt.setString(1, id);
			res=pstmt.executeQuery();
			
			while(res.next()) {
				String a=res.getString(1);
				String b=res.getString(2);
				String c=res.getString(3);
				String d=res.getString(4);
				String e=res.getString(5);
				String f=res.getString(6);
				
				 ab=new AccountantBean(a,b,c,d,e,f);
			}
			
			
		} 
		catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return ab;
		
	}
	
	
	public List ViewAllAccountants() {
		
		Connection con=DatabaseConnection.getConnection();
		Statement stmt=null;
		ResultSet res=null;
		AccountantBean ab=null;
		List l=new ArrayList();
		
		try {
			stmt=con.createStatement();
			res=stmt.executeQuery("SELECT * FROM ACCOUNTANTS");
			
			while(res.next()) {
				String a=res.getString(1);
				String b=res.getString(2);
				String c=res.getString(3);
				String d=res.getString(4);
				String e=res.getString(5);
				String f=res.getString(6);
				
				 ab=new AccountantBean(a,b,c,d,e,f);
				 
				 l.add(ab);
				 
			}
			
		} 
		catch (SQLException e) {
			
			e.printStackTrace();
		}
		return l;
	
	}
	
	public void delAccountant(String id) {
		
		Connection con=DatabaseConnection.getConnection();
		PreparedStatement pstmt=null;
		
		try {
			pstmt=con.prepareStatement("DELETE FROM ACCOUNTANTS WHERE ID=?");
			pstmt.setString(1, id);
			pstmt.executeUpdate();
		} 
		catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}
	
	public static boolean validateAccountant(String email,String password) {
		
		Connection con=DatabaseConnection.getConnection();
		PreparedStatement pstmt=null;
		ResultSet res=null;
		boolean status=false;
		
		try {
			pstmt=con.prepareStatement("SELECT * FROM ACCOUNTANTS WHERE EMAIL=? AND PASSWORD=?");
			pstmt.setString(1, email);
			pstmt.setString(2, password);
			res=pstmt.executeQuery();
			status=res.next();
			
			
		} 
		catch (SQLException e) {
			
			e.printStackTrace();
		}
		return status;
	}
	
}
