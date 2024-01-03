<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>
<html>
<head>
 <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap demo</title>
    <c:import url="../temps/bootstrap_css.jsp"></c:import>
    </head>
</head>
<body>
	<c:import url="../temps/header.jsp"></c:import>
	
	<section class="container-fluid">
		<div>
			<c:if test="${detail != null }">	
			<h3>${requestScope.detail.region_id}</h3>
			<div>${detail.region_name}</div>
			</c:if>
			<c:if test="${empty detail }">
				<h3>없는번호입니다</h3>
			</c:if>
		</div>
		
			
	</section>


	<c:import url="../temps/bootstrap_js.jsp"></c:import>
	 
</body>
</html>