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
	<c:set value="1" var="visitCount"
		property="visitCount"/>
		
	<c:if test="${visitCount==1 }">
	THIS IS YOUR FIRST VISIT!welcome
	</c:if>
	<br/>
	<!-- 	if-else -->
	<c:choose>
		<c:when test="${empty param.usernamne }">
			unknow user.
		</c:when>
		<c:when test="${param.usernamne=='liu' }">
			${param.usernamne } is manager.
		</c:when>
		<c:otherwise>
			${param.usernamne } is employ.
		</c:otherwise>
	</c:choose>
</body>
</html>