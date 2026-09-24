<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 
int rno=Integer.parseInt(request.getParameter("rno"));
String sname=request.getParameter("sname");
float mark=Float.parseFloat(request.getParameter("mark"));
out.println("<h1>Roll NUmber :"+rno+"</h2>");
out.println("<h1>Student Name :"+sname+"</h2>");
out.println("<h1>Student MArk :"+mark+"</h2>");


%>


</body>
</html>