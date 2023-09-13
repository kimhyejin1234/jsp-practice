<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	#이름 : ${param.name } <br>
	#나이 : ${param.age } <br>
	
	<c:set var="age" value="${param.age }"/>
	<c:choose>
		<c:when test="${age>20}">
			<h3>성인입니다.</h3>
		</c:when>
		<c:otherwise>
			<h3>아기입니다.</h3>
		</c:otherwise>
	</c:choose>
</body>
</html>