<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
URI: ${pageContext.request.requestURL }<br>
Content_Type响应头 ${pageContext.response.contentType }<br>

<%-- ${pageContent.response.contentType }<br> --%>
服务器信息：${pageContext.servletContext.serverInfo }<br>
Servlet注册名：${pageContext.servletConfig.servletName }<br>

</body>
</html>