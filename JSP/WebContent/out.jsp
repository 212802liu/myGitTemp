<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!--     解决方案 -->
<%--     <%@ page buffer="0kb" %> --%>
<!-- Cttl +shift+c    注释快捷键-->
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	out.println("first line!<br>");
	response.getWriter().print("second line!<br>");
	%>
</body>
</html>