<%@page import="user.User_self"%>
<%@page import="user.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<p>
		#아이디 : ${member.userId };<br> #비밀번호 : ${member.userPw };<br>
		#이름 : ${member.userName };<br> #이메일: ${member.userEmail };
	</p>



</body>
</html>