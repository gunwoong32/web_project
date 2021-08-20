<%@page import="shop.db.회원DAO2"%>
<%@page import="shop.dto.회원Bag"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <% 
    //1. 게시판에 입력한 값을 가지고 와야함.
    //2. 가방을 만들어서 1번의 값들을 넣어준다.
    //3. 게시판DAO를 만들어서 create기능을 처리하라고 메서드 호출
    
    String id = request.getParameter("id");
    
    회원Bag bag = new 회원Bag();
	bag.setId(id);
    
	회원DAO2 dao	= new 회원DAO2();
	회원Bag bag2 = dao.read(bag);
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>회원정보 검색 결과입니다</h3>
 <hr>
 검색된 id는 <%=bag2.getId() %> <br>
 검색된 pw는 <%=bag2.getPw() %> <br>
 검색된 name는 <%=bag2.getName() %> <br>
 검색된 tel는 <%=bag2.getTel() %> <br>

</body>
</html>