<%@page import="java.util.ArrayList"%>
<%@page import="shop.dto.회원Bag"%>
<%@page import="shop.db.회원DAO2"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%// ' <% ' : 스크립트릿 (서버에서 돌아가는 작성된 작은 프로그램)
    	회원DAO2 dao = new 회원DAO2();
    
		//jsp파일에서 자동 import 단축키 : 클릭후, ctrl + shift +m    
    	ArrayList<회원Bag> list = dao.read();
    %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%= list %> <!-- 표현식 -->
</body>
</html>