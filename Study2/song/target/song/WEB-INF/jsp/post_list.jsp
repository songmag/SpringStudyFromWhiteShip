<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>PostList</title>
</head>
<body>
	<div>
		<h1>Post-List</h1>
	</div>
	<div>
		<c:forEach var="item" items="PostNav">
			<span>${item.name}</span>
		</c:forEach>
	</div>
	<table>
		<tr><th>post_number</th><th>post_name</th><th>post_owner</th><th>post_date</th><th>count</th></tr>
		<c:forEach var="item" items="postList">
			<tr>
				<a href="<c:url value="/post?postNumber=${item.postNumber}"/>">
					<td><c:out value="${item.postNumber}"/></td>
					<td><c:out value="${item.postName}"/></td>
					<td><c:out value="${item.postOwner}"/></td>
					<td><c:out value="${item.postDate}"/></td>
					<td><c:out value="${item.postCount}"/></td>
				</a>
			</tr>
		</c:forEach>
		<tr>
			<c:forEach var="item" items="postPageList">
				<td class="page" id="${item.nowSelect}"><c:out value="${item.page}"/></td>
			</c:forEach>
		</tr>
	</table>
</body>
</html>