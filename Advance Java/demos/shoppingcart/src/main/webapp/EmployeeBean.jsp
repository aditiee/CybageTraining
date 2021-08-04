<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Demo: Action</h1>
       <jsp:useBean id="emp" class="beans.Employee"/>
       <jsp:setProperty name="emp" property="*"/>
       <h1>
          Employee name:<jsp:getProperty name="emp" property="name"/><br>
          Empno:<jsp:getProperty name="emp" property="empid"/><br>
       </h1>
</body>
</html>