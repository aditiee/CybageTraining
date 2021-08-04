<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core"%>
    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<core:set var="num1" value="101"></core:set>
<core:set var="age" value="26"/>
<core:if test="${age >= 18}">
 <core:out value="You are eligible for voting!"/>
</core:if>
<core:if test="${age < 18}">
 <core:out value="You are not eligible for voting!"/>
</core:if>

<core:set var="number1" value="${222}"/>
<core:set var="number2" value="${12}"/>
<core:set var="number3" value="${10}"/>
<core:choose>
 <core:when test="${number1 < number2}">
     ${"number1 is less than number2"}
 </core:when>
 <core:when test="${number1 <= number3}">
     ${"number1 is less than equal to number2"}
 </core:when>
 <core:otherwise>
     ${"number1 is largest number!"}
 </core:otherwise>
</core:choose>


<h1>${num1}</h1>
</body>
</html>