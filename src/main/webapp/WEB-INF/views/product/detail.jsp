<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:import url="../temps/bootstrap_css.jsp"></c:import>
</head>
<body>
	<c:import url="../temps/header.jsp"></c:import>
	<div>
		<h1>${requestScope.detail.productnum}</h1>
		<h1>${requestScope.detail.productname}</h1>
		<h1>${requestScope.detail.productcontents}</h1>
		<h1>${requestScope.detail.productrate}</h1>
		<h1>${requestScope.detail.productjumsu}</h1>
		
	
	</div>
	
	<c:import url="../temps/bootstrap_js.jsp"></c:import>
</body>
</html>