<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:out value="hello world!"></c:out>
	
	<%--第一个out标签 --%>
	userName'value:
	<c:out value="${param.username }" default="unknown"/><!-- 	default为默认值 --><br>
	<%--第2个out标签 --%>
	userName'value:
	<c:out value="${param.username }"><br>
	unknown    		<!-- 	为默认值 -->
	</c:out>
	
<!-- 	escapeXml为是否编译其中html代码，默认为true -->
	
	<c:out value="${param.username }" escapeXml="ture">
	<meta http-equiv="refresh"
		content="2;url=http://www.baidu.com"/>
	</c:out>
</body>
</html>