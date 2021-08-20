<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	String id = request.getParameter("id");
    	session.setAttribute("id2", id);
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% if(session.getAttribute("id2") != null){%>
	세션 id값은 :<%= session.getAttribute("id2")%>
<%} %>

<a href = "news.jsp">뉴스</a>
<a href = "mail.jsp">메일</a>
<a href = "cafe.jsp">카페</a>
</body>
</html>