<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Admin Home</title>
</head>
<body>
<h2>Hi ADMIN choose what you want to do!!!!</h2>
<form action="AddAccountant">
<input type="submit" name="addAccountant" value="ADD ACCOUNTANT">
</form><br><br>

<form action="ViewAccountant">
<input type="submit" name="viewAccountant" value="VIEW ACCOUNTANT">
</form><br><br>

<form action="ViewAllAccountants">
<input type="submit" name="viewAllAccountants" value="VIEW ALL ACCOUNTANTS">
</form><br><br>

<form action="DeleteAccountant">
<input type="submit" name="deleteAccountant" value="DELETE ACCOUNTANT">
</form><br><br>

</body>
</html>