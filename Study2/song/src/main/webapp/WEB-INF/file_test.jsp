<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<form method="post" enctype="multipart/form-data" action="<c:url value="/file"/>">
		<input type="file" name="file"/>
		<input type="submit" value="Submit"/>
	</form>
</body>
</html>