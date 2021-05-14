<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String[] fruits={"apple","orange","grape","banana","watermelon","starwberry"};
	%>
	<br>
	String数组中的元素:
	<br/>
	<c:forEach var="name" items="<%=fruits %>">
		${name }<br>
	</c:forEach>
	
	
	<%
		Map userMap=new HashMap();
		userMap.put("tom","123");
		userMap.put("Make","123");
		userMap.put("Lina","123");
	%>
	<hr>
	hashMap集合中的元素：
	<br>
	<c:forEach var="entry" items="<%=userMap %>">
	${entry.key }&nbsp;${entry.value } <br>
	</c:forEach>
	<hr>
	<%
		List colorList=new ArrayList();
		colorList.add("red");   //0
		colorList.add("yellow");  //1
		colorList.add("blue");
		colorList.add("black");
		colorList.add("green");
	%>
	<c:forEach var="color" items="<%=colorList %>" begin="1" end="4" step="2">
		${color }&nbsp;
	</c:forEach>
	<hr>
	<%
		List userList =new ArrayList();
		userList.add("tom");
		userList.add("make");
		userList.add("Lina");
	%>
	<table border="1">
		<tr>
			<td>序号</td>
			<td>索引</td>
			<td>是否为第一个元素</td>
			<td>是否为最后一个元素</td>
			<td>元素值</td>
		</tr>
		<c:forEach var="name" items="<%=userList %>" varStatus="status">
			<tr>
				<td>${status.count }</td>
				<td>${status.index }</td>
				<td>${status.first }</td>
				<td>${status.last }</td>
				<td>${name }</td>
		</c:forEach>
	</table>
</body>
</html>