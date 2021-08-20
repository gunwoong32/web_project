<%@page import="product.ProductDTO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="product.ProductDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	ProductDAO dao = new ProductDAO();
    ArrayList<ProductDTO> list = dao.read();	//ArrayList<ProductBag>
    	
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>회원정보 검색 결과입니다</h3>
<hr color ="green">
<table border=1>
<tr bgcolor="yellow">
	<th>아이디</th>
	<th>제 목</th>
	<th>내 용</th>
	<th>작성자</th>
</tr>
<%
	for(ProductDTO dto : list){

%>
<tr bgcolor ="pink" >

	<td><%=dto.getId() %></td>
	
	<td>
	<a href ="http://localhost:8889/web27/read.jsp?id=<%=dto.getId() %>">
			<%=dto.getId() %>
	</a>
	</td>
	<td><%=dto.getContent() %></td>
	<td><%=dto.getPrice() %></td>
</tr>
<%} %></table>

</body>
</html>