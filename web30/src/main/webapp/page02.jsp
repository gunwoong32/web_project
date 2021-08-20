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
		Cookie[] list = request.getCookies();    
    	for(Cookie c: list){
    		//out:브라우저에 텍스트로 프린트하고 싶을 때
    		if(!c.getName().equals("JSESSIONID")){
    			out.print(c.getValue() + "<br>");
    	}
    	}
	%>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>page02</title>
</head>
<body>

</body>
</html>