<%@page import="shop.db.회원DAO2"%>
<%@page import="shop.dto.회원Bag"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    	String id = request.getParameter("id");
    	// -> DB처리하는 DAO에게 주면서 탈퇴하는SQL문을 만들어서 전송해야한다.
    	
    	// 가방을 만들어서 데이터를 넣자.
    	회원Bag bag = new 회원Bag();
    	bag.setId(id);
    	//DAO를 만들어서 탈퇴요청!
    	회원DAO2 dao = new 회원DAO2();
    	int result = dao.delete(bag);
    	String text = "삭제 실패했습니다. 재가입해주세요. ";
    	if(result == 1){
    		text = "삭제 성공했습니다. 축하드립니다.";
    	}
    %>
    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
실행결과는 <%= text %>
</body>
</html>