<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="com.sashi.dao.*" %>
<%@ page import="com.sashi.model.*" %>
<%@ page import="java.util.*" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>All Accountants</title>
</head>
<body>
<%
AccountantDao ad=new AccountantDao();
List l=ad.ViewAllAccountants();

out.println("<table border=\"2\">");
out.println("<tr><th>ID</th><th>NAME</th><th>EMAIL</th><th>PASSWORD</th><th>PLACE</th><th>CONTACT</th></tr>");
for(Object x:l){
	AccountantBean a=(AccountantBean)(x);
	out.println("<tr><td>"+a.getId()+"</td><td>"+a.getName()+"</td><td>"+a.getEmail()+"</td><td>"+a.getPassword()+"</td><td>"+a.getPlace()+"</td><td>"+a.getContact()+"</td></tr>");
}



%>


</body>
</html>