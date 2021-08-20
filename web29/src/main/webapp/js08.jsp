<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel = "stylesheet" href = "out.css">
<script type="text/javascript">

money = prompt('결제금액을 입력해주세요')
money2 = parseInt(money)
member = prompt('1)일반, 2)VIP')
function payment() {
	if (member == '1') {
		alert('결제금액은 ' +(money2 * 1.1) +'입니다' )
	}
	else {
		alert('결제금액은 ' +(money2 * 0.9) +'입니다' )
	}
}

</script>

<script type="text/javascript">

String user_id="root";
int post_no=Integer.parseInt(request.getParameter("post_no"));

function move(){
if (user_id=="root" && post_no=Integer.parseInt(request.getParameter("post_no"));>){
	location.href='jsp/marketDelete.jsp'
}
 else {
	 location.href='jsp/marketMain.jsp'
}
}
</script>


</head>
<body>
<button onclick="payment()">결제</button>
</body>
</html>