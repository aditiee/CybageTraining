<%@page errorPage="First.jsp" %>
<html>
<body>
<a href="/CategoriesList">Click</a>
<h2>Hello World!</h2>

<%
pageContext.setAttribute("uname",request.getParameter("uname"),PageContext.REQUEST_SCOPE);
RequestDispatcher rd=request.getRequestDispatcher("First.jsp");
rd.include(request,response);
%>

</body>
</html>
