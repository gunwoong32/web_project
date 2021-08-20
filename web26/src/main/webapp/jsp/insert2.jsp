<%@page import="shop.db.게시판DAO"%>
<%@page import="shop.dto.게시판Bag"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	//	2번에서 만든 가방을 입력값으로 주어야함.
    	//게시판DAO를 게시판용으로 변경해주세요
    	//4. html로 알려주세요.

    	//1. 게시판에 입력한 값을 가지고 와야함.
    	String id = request.getParameter("id");
    	String title = request.getParameter("title");
    	String content = request.getParameter("content");
    	String writer = request.getParameter("writer");
    	
    	//2. 가방을 만들어서 1번의 값들을 넣어준다.
    	게시판Bag bag = new 게시판Bag();
    	bag.setId(id);
    	bag.setTitle(title);
    	bag.setContent(content);
    	bag.setWriter(writer);
    	
    	//3. 게시판DAO를 만들어서 create기능을 처리하라고 메서드 호출
    	게시판DAO dao = new 게시판DAO();
    	int result = dao.create(bag);
    	String text = "회원 가입 실패했습니다. 재가입해주세요. ";
    	if(result == 1){
    		text = "회원가입 성공했습니다. 축하드립니다.";
    	}
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="yellow">
실행결과는 <%=text %>
</body>
</html>