<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    String title = request.getParameter("title");
    String writer = request.getParameter("writer");
    String content = request.getParameter("content");
    String kind = request.getParameter("kind");
    String department = request.getParameter("department");
    String date = request.getParameter("date");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>서버에서 받은 값들</title>
</head>
<body>
<h3>서버에서 받은 값들</h3>
<hr color ="red">
서버에서 받은 제목 : <%=title %><br>
서버에서 받은 글쓴이 : <%=writer %><br>
서버에서 받은 내용 : <%=content %><br>
서버에서 받은 종류 : <%=kind %><br>
서버에서 받은 부서 : <%=department %><br>
서버에서 받은 날짜 : <%=date %><br>
</body>
</html>