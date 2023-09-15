<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>게시글 목록 _self</h2>
	<table border="1">
		<tr>
			<th>번호</th>
			<th>작성자</th>
			<th>제목</th>
			<th>작성일</th>
			<th>비고</th>
		</tr>
		
		
		<%-- c:forEach 의 속성인 varStatus 를 활용하면
					현재 사영중인 반복문의 여러가지 속성을 사용할 수 있습니다.
					${status.count):1부터의 순서
					${status.index):0부터의 순서
					${status.current):현재 아이템
					
				 --%>
		<c:forEach var = "b" items="${boardList}" varStatus="status">
			<tr>
				<td>${status.count}</td>
				<td>${b.writer}</td>
				<td>${b.title}</td>
				<td>${b.regDate}</td>
				<td><a>삭제</a></td>
			</tr>
		</c:forEach>
	</table>
	<a>새 글 작성하기</a>
</body>
</html>