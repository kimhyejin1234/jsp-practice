<%@page import="java.util.Arrays"%>
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


	<c:set var="total" value="0"/>
	<c:forEach var="j" begin="1" end="100">
		<c:set var="total" value="${total+j}"/>
	</c:forEach>
	<h4>1부터100까지의 누적합: ${total} </h4>
	<hr>
	
	<c:forEach var="hang" begin="1" end="9">
		<!-- step 을 생략시 자동으로 1로 처리됨 -->
		4 X ${hang} = ${4*hang}<br>
	</c:forEach>

	<hr>
	<!-- 구구단을 2~9단 까지 출력하는데, 짝수단만 출력해 보세요(jstl,el)  -->
	<c:forEach var="dan" begin="2" end="9">
		<c:if test="${dan %2 == 0}">
			<h4>=== 구구단 : ${dan} 단 출력 ===</h4>
			<c:forEach var="row" begin="1" end="9">
			${dan} X ${row} = ${dan*row}<br>
			</c:forEach>
		</c:if>
	</c:forEach>

	<hr>

	<h2>배열이나 컬렉션 내부의 값을 출력</h2>
	<c:set var="arr" value="<%= new int[] {1,3,5,7,9} %>" />
	<c:forEach var="n" items="${arr }">
		${n } &nbsp;
	</c:forEach>

	<hr>
	<c:set var="namelist"
		value='<%=Arrays.asList("홍길동","김철수","박영희","김매롱") %>' />
	<c:forEach var="name" items="${namelist}">
		${name}<br>
	</c:forEach>



</body>
</html>