<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<c:import url="../temps/bootstrap_css.jsp"></c:import>
	
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:import url="../temps/header.jsp"></c:import>
	<h1>list </h1>
	<table>
		<thead>
			<tr>
			<th>num </th>
			<th>name</th>
			<th>contents</th>
			<th>rate</th>
			<th>jumsu</th>
			</tr>
		</thead>
		
		<tbody>
				<c:forEach items="${requestScope.list}" var = "dto">
			<tr>
		
					<td>${dto.productnum}</td>
					<td><a href="detail?productnum=${dto.productnum}" >${dto.productname }</a></td>
					<td>${dto.productcontents }</td>
					<td>${dto.productrate }</td>
					<td>${dto.productjumsu }</td>
			
			</tr>
				</c:forEach>
			
		</tbody>
	</table>
		
		<a class="btn btn-primary" href="add" >add  </a>
	
	<c:import url="../temps/bootstrap_js.jsp"></c:import>
	
</body>
</html>