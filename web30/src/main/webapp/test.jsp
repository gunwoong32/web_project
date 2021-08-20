<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- 테스트할때 이렇게 하세요 -->
    <%
    	//String id = (String)session.getAttribute("id"); 이거막아놓아요
    	String id = "apple";
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="insert.jsp">
게시 제목 : <input name = "title"><br> 
게시 내용 : <input name = "content"><br> 
게시 id : <input name = "id" value ="<%=(String)session.getAttribute("id")%>"><br> 
게시 id : <input name = "id" value ="${id}"><br> 
게시 id : <input name = "id" value ="<%= id %>"><br> 

</form>


</body>
</html>