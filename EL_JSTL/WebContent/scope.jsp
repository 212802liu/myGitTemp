<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%pageContext.setAttribute("scope", "page"); %>
	<%request.setAttribute("scope1", "request"); %>
	<%session.setAttribute("scope2", "session"); %>
	<%application.setAttribute("scope3", "application"); %>
	<hr>
	表达式\${pageScope.scope}的值为${pageScope.scope }<br>
	表达式\${requestScope.scope1}的值为${requestScope.scope1 }<br>
	表达式\${sessionScope.scope2的值为${sessionScope.scope2 }<br>
	表达式\${applicationScope.scope3}的值为${applicationScope.scope3 }<br>
	<hr>
	<%request.setAttribute("scope", "request"); %>
	${scope }<br>
</body>
</html>