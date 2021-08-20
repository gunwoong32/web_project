<%@page import="shop.db.게시판DAO"%>
<%@page import="shop.dto.게시판Bag"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <% 
    
    //1. 게시판에 입력한 값을 가지고 와야함.
    //2. 가방을 만들어서 1번의 값들을 넣어준다.
    //3. 게시판DAO를 만들어서 read기능을 처리하라고 메서드 호출
    
    
    
    //1. 게시판에 입력한 값을 가지고 와야함.
    String id = request.getParameter("id");
   
    //2. 가방을 만들어서 1번의 값들을 넣어준다.
	게시판Bag bag = new 게시판Bag();    
    bag.setId(id);
   
    //3. 게시판DAO를 만들어서 read기능을 처리하라고 메서드 호출
    게시판DAO dao = new 게시판DAO();
    게시판Bag bag2 = dao.read(bag);
    
    
    %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>read2</title>
</head>
<body>
<h3>회원정보 검색 결과입니다</h3>
<table border=1>
 <hr color="red">
 <tr bgcolor="yellow">
 <td>id</td>
 <td>title</td>
 <td>content</td>
 <td>writer</td>
 </tr>
 <tr bgcolor="skyblue">
 <td><%=bag2.getId() %></td>
 <td><%=bag2.getTitle() %></td>
 <td><%=bag2.getContent() %></td>
 <td><%=bag2.getWriter() %></td>
 </tr>
 
</table>
</body>
</html>