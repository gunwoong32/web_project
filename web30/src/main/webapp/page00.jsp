<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 쿠키 세션 정리 문제
==================
1. page01.jsp - 선호하는 카테고리: 운동, 선호하는 운동 종류: 축구 를 쿠키로 저장
2. page02.jsp - 1번의 쿠키를 가지고 와서 전체 프린트, JSESSIONID는 제외
3. page03.jsp - 전체 조회수: 100을 세션으로 저장
4. page04.jsp - 전체 조회수를 가지고 와서 1증가 후 101을 다시 세션으로 저장
5. page05.jsp - 조회수 프린트 -->
    <%
    	//쿠키 바로 삭제는 setMaxAge(0)으로 다시 심는다.
    	//1. 쿠키 객체를 만든다. 2개를 만든다.
    	Cookie c1 = new Cookie("category","운동");	//name,value
    	//3. 쿠키를 브라우저에서 지운다.
    	c1.setMaxAge(0);
    	//2. 쿠키를 브라우저에 심는다.
    	response.addCookie(c1);	//브라우저에게 쿠키를 심으라고 명령함
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
브라우저에 쿠키를 심었음.<br>
</body>
</html>