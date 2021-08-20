<%@page import="product.ProductDAO"%>
<%@page import="product.ProductDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    
    //1. 게시판에 입력한 값을 가지고 와야함.
    String id = request.getParameter("id");
    
    //2. 가방을 만들어서 1번의 값들을 넣어준다.
    ProductDTO dto = new ProductDTO();
    dto.setId(id);
    
    //3. 게시판DAO를 만들어서 read기능을 처리하라고 메서드 호출
    ProductDAO dao = new ProductDAO();
    ProductDTO dto2 = dao.read(dto);
    
    %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border=1>
 <hr color="red">
 <tr bgcolor="yellow">
 <td>id</td>
 <td>title</td>
 <td>content</td>
 <td>writer</td>
 </tr>
 <tr bgcolor="skyblue">
 <td><%=dto2.getId() %></td>
 <td><%=dto2.getName() %></td>
 <td><%=dto2.getContent() %></td>
 <td><%=dto2.getPrice() %></td>
 </tr>
 
</table>
</body>
</html>