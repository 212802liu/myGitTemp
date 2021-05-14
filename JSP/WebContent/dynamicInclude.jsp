<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	dynamicIclude.jsp内中文<br>
<!-- 	flush用于是否将当前页面的输出内容刷新到客户端，默认为false -->
	<jsp:include page="included.jsp" flush="true"/>
</body>
</html>