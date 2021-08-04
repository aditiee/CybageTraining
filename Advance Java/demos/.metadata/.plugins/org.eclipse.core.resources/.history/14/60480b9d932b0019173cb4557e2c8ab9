<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
     
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
  "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>&lt;sql:dateParam&gt; Demo</title>
  </head>
  <body>
    <h1>&lt;sql:dateParam&gt; Demo</h1>
    <form name="my"   action="${pageContext.request.contextPath}/SQLTag.jsp"
        method="POST">
    <table border="0"> <tr>
        <td>* Enter Emp_ ID:</td>
        <td><input type="text" name="eid" />
      </tr>
      <tr>
        <td>* Enter Last Name:</td>
        <td><input type="text" name="name" />
      </tr>
      <tr>
        <td>* Enter Salary: </td>
        <td><input type="text" name="sal" /></td>
      </tr>           
      <tr>
        <td><input type="submit" value="Submit"/></td>
      </tr>
    </table>       
     </form>
     <br/><br/>
     
    <sql:setDataSource var="myDS" driver="com.mysql.jdbc.Driver"
  url="jdbc:mysql://localhost:3306/frdb" user="root" password="root" />
         
    <c:choose>
   <c:when test="${not empty param.eid  && not empty param.name && not empty param.sal}">       
        <sql:update dataSource="${myDS}" var="emp">
            INSERT INTO empl VALUES (?, ?, ?)           
            <sql:param value="${param.eid}" />
            <sql:param value="${param.name}" />
            <sql:param value="${param.sal}"/>   
                    
        </sql:update>
    </c:when>
    <c:otherwise>
        <font color="#cc0000">Please enter mandatory information.</font>
    </c:otherwise>
    </c:choose>
     
    <br/><br/>
    <sql:query dataSource="${myDS}" var="emp">
        SELECT * from empl;
    </sql:query>
    <table border="1">
    <tr>
    <th>Employee ID</th>
    <th>Employee Name</th>
    <th>Employee Salary</th>
    <th>Action</th>
    </tr>
        <c:forEach var="row" items="${emp.rows}">
            <tr>               
                <td><c:out value="${row.e_id}" /></td>
                <td><c:out value="${row.ename}" /></td>
                <td><c:out value="${row.sal}" /></td>  
                   
             </tr>
        </c:forEach>
        
    </table>
    </body>
</html>