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
	int count = (int)session.getAttribute("count");	//object<--자동변환-- int
	count++;
	//object--강제session.getAttribute("count")변환'(int)''-->int
	session.setAttribute("count", count);	//증가된 값을 다시 저장
%>





<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
현재 count : <%= session.getAttribute("count")%>		
<!-- <%-- <%= session.getAttribute("count")%> --%> 이것과 ${count}랑 같다. -->
<a href="page05.jsp">카운트값 확인</a>
</body>
</html>