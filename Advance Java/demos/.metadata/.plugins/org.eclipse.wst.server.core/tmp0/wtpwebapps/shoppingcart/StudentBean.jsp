<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% %>


<h1>Demo: Action</h1>
       <jsp:useBean id="s1" class="beans.Student" scope="page"/>
       <jsp:setProperty name="s1" property="student_id" value="102"/>
       <jsp:setProperty name="s1" property="name" value="John"/>
       <h1>
          Employee name:<jsp:getProperty name="s1" property="student_id"/><br>
          Empno:<jsp:getProperty name="s1" property="name"/><br>
       </h1>

<%-- 
<jsp:useBean id="s1" class="com.cybage.beans.Student"></jsp:useBean>
<jsp:setProperty property="*" name="s1"/>


Details of Students are: 

Id: <jsp:getProperty property="student_id" name="s1"/>
Name: <jsp:getProperty property="name" name="s1"/>
 --%>

</body>
</html>