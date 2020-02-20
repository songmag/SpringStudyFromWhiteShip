<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Main Page</title>
</head>
<style>
	.container{
		position : relative;
		margin-left : 20px;
		width : auto;
		height : auto;
	}
	.container>*{
		position : relative;
		width : auto;
		margin-left : 20px;	
	}
	.nav{
		
		height : 100px;
	}
	.main{
		
		height: auto;
	}
	.footer{
		height : 100px;
	}
	.user{
		height: 100px;
		margin-bottom: 15px;
	}
	.user table{
		width: 600px;
	}
	.user .information{
		display : inline-block;
		width : 1000px;
	}
	.user img{
		width: 100px;
		height: 100px;
		display : inline-block;
		border : 1px solid ;
	}
	.user{
		display: block;
		position: relative;
	}
	.navItem{
		width:150px;
		height: 100px;
		display: inline-block;
		border : 1px solid ;
	}
	.logo {
		height : 50px;
	}
	h1{
		margin : 0px;
	}
</style>
<body>
	<div class="container">
		<div class="logo">
			<h1>Logo Position</h1>
		</div>
		<div class="nav">
			<c:forEach var="navItem" items="${navList}">
				<div class="navItem">
					<a href="<c:url value="/${navItem.urlPath}"/>">${navItem.name}</a>
				</div>
			</c:forEach>
		</div>
		<div class="main">
			<!-- 유저리스트를 표현한다. 사진, 이름, 간단한 자기소개, 국적, 버튼으로는 대화하기 버튼이 존재/web Socket으로 연다 . -->
			<div class="user">
				<table>
					<tr>
					<td rowspan="4">
				<img src="${userItem.thumbnail}" />
				</td>
				<td>
					<span class="name">Name : ############</span>
				</td>
				<td>
					<span class="address">Address : ##################</span>
				</td>
				</tr>
				<tr>
				<td>
				<span class="country">Country :####################### </span>
				</td>
				<td>
					Phone-Number : ###################
				</td>
				</tr>
				<tr>
				<td colspan="2">
					<span class="instruction">Instruction : ################ </span>
				</td>
				</tr>
				<tr>
				<td colspan="2" style="text-align: right;"><button type="button">Send Message</button></td>
				</tr>
				</table>
			</div>
			<c:forEach items="${userList}" var="userItem" >
			<div class="user">
				<table>
					<tr>
					<td rowspan="4">
				<img src="${userItem.thumbnail}" />
				</td>
				<td>
					<span class="name">Name : ${userItem.name}</span>
				</td>
				<td>
					<span class="address">Address : ${userItem.address} </span>
				</td>
				</tr>
				<tr>
				<td>
				<span class="country">Country : ${userItem.country} </span>
				</td>
				<td>
					Phone-Number : ${userItem.phoneNumber}
				</td>
				</tr>
				<tr>
				<td colspan="2">
					<span class="introduction">Instruction : ${userItem.introduction} </span>
				</td>
				</tr>
				<tr>
				<td colspan="2" style="text-align: right;"><button type="button">Send Message</button></td>
				</tr>
				</table>
			</div>
			</c:forEach>
		</div>
		<div class="footer">
			
		</div>
	</div>
</body>
</html>