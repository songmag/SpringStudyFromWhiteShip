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
	input{
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
		<h1>Sign Up</h1>
	</div>
	<form method="post" enctype="multipart/form-data" action="<c:url value=""/>">
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
			<td><label for="name" class="label">Name</label></td>
			<td><input type="text" name="name" id="name"/></td>
			</tr>
			<tr>
			<td><label for="email" class="label">Email</label></td>
			<td><input type="text" name="email" id="email"/></td>
			</tr>
			<tr>
			<td colspan="2">
			<input type="file" name="file" id="file">
			</td>
			</tr>
			<tr>
			<td colspan="2"><input type="submit" value="Submit"/></td>
			</tr>
		</table>
	</form>
</body>
</html>