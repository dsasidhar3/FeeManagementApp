<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="com.sashi.dao.*" %>
<%@ page import="com.sashi.model.*" %>
<%@ page import="java.util.*" %>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Dues</title>
</head>
<body>
<%

StudentDao sd=new StudentDao();
List l=sd.viewDues();

out.println("<table border=\"2\">");

out.println("<tr><th>ROLLNUM</th><th>NAME</th><th>EMAIL</th><th>GENDER</th><th>COURSE</th><th>FEE</th><th>PAID</th><th>DUE</th><th>ADDRESS</th><th>CONTACT</th></tr>");
for(Object x:l){
	StudentBean a=(StudentBean)(x);
	out.println("<tr><td>"+a.getRollnum()+"</td><td>"+a.getName()+"</td><td>"+a.getEmail()+"</td><td>"+a.getGender()+"</td><td>"+a.getCourse()+"</td><td>"+a.getFee()+"</td><td>"+a.getPaid()+"</td><td>"+a.getDue()+"</td><td>"+a.getAddress()+"</td><td>"+a.getContact()+"</td></tr>");
}

%>

</body>
</html>