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
		#data1 :
		<%=session.getAttribute("data1") %>
		<br> #data2 :
		<%=application.getAttribute("data2") %>
	</p>


	<hr>
	<p>
		#data1 : ${sessionScope.data1 }<br> #data2 :
		${applicationScope.data2 }<br>

	</p>

</body>
</html>