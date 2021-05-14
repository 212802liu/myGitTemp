<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
<%!
		int a=1,b=2;
	%>
	<%!
		public String print(){
		return "lllk快快快";
	}
	%>
</head>
<body>
	
	<%
	out.println(a+b);
	%>
	<br>
	<%
	out.println(print());
	%>
	<%-- //JSP表达式--%>
	
	<%=a+b %>   <%--//只能插表达式 --%>
	<%=print() %>   <%--//% =之间不能有空格 --%>
	
	<%@ include file="helloWorld.jsp" %>
	
	
</body>
</html>