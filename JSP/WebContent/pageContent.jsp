<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
// 	获取requestduixiang
	HttpServletRequest res=(HttpServletRequest) pageContext.getRequest();
	//设置page范围内的属性
	pageContext.setAttribute("str", "java", pageContext.PAGE_SCOPE);
	//设置reque范围内的属性
	res.setAttribute("str", "Java Wed");
	//获取page范围内属性
	String str1=(String ) pageContext.getAttribute("str",pageContext.PAGE_SCOPE);
	//获取reque范围内属性
	String str2=(String) pageContext.getAttribute("str", pageContext.REQUEST_SCOPE);
	%>
	<%="page范围："+str1 %><br>
	<%="requset范围："s+tr2 %>
</body>
</html>