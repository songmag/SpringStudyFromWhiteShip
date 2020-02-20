<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
<style>
	.label{
		margin-right:10px;
	}
	input, button{
		width: 150px;
		height : 25px;
		font-size : 10px;
		margin-bottom : 10PX;
	}
	body{
	text-align:center;
	}
	table{
	display:inline-block;
	}
</style>
</head>
<body>
	<div>
		<h1>Login</h1>
	</div>
	<form method="post" enctype="application/json" action="<c:url value="/login"/>">
		<table>
			<tr>
			<td><label for="id" class="label">ID</label></td>
			<td><input type="text" name="id" id="id"/></td>
			</tr>
			<tr>
			<td><label for="password" class="label">Password</label></td>
			<td><input type="password" name="password" id="password"/></td>
			</tr>
			<tr>
			<tr>
			<td><input type="submit" value="SignIn"/></td>
			<td><button type="button" onclick="location.href='<c:url value="/login/signup"/>'">SignUp</button>
			</td>
			</tr>
		</table>
	</form>
</body>
</html>