<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel = "stylesheet" href = "out.css">
<script type="text/javascript">

id =prompt('id를 입력해주세요')
pw =prompt('pw를 입력해주세요')

function move() {
	if (id =='root' && pw == '1234' ) {
		location.href = 'http://www.naver.com'
	} else {
		location.href = 'http://www.daum.net'
	}
}




</script>

</head>
<body>
<button onclick="move()">사이트로 이동</button>
</body>
</html>