<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" autoFlush="true" isErrorPage="true"%>
  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


Name is: <%=request.getParameter("u") %>
Exception is: <%=exception %>


<%!int x=89,i=0; %>

Welcome <%= pageContext.getAttribute("uname",PageContext.REQUEST_SCOPE) %>
<table border=2>
<tr> <th> Values</th></tr>
<% for(i=0;i<5;i++){ %>
<tr><td><%=i %></td> <%} %> </tr>
</table>
<%-- <% if(x>90){
System.out.println(x+"Greater than 90"); } else%>
<br>
<% System.out.println(x+"Less than 90"); %> --%>

</body>
</html>