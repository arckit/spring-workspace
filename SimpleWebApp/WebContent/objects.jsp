<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% String name=request.getParameter("name");
if(name !=null){
	session.setAttribute("session", name);
	application.setAttribute("applCtx", name);
	pageContext.setAttribute("pageCtx", name);
}%>

Request : <%=request.getParameter("name") %>

<br>
Session : <%=session.getAttribute("session") %>

<br>
appCtx : <%=application.getAttribute("applCtx") %>

<br>
pageCtx : <%=pageContext.getAttribute("pageCtx") %>

</body>
</html>