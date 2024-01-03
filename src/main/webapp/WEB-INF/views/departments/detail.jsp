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
   	
   	<div>
   		<c:if test="${detail != null }">
   		<h1>${detail.department_id}</h1>
   		<h1>${detail.department_name }</h1>
   		<h2>${detail.location_id }</h2>
   		<h3>${detail.manager_id }</h3>
   		</c:if>
   		<c:if test="${detail == null }">
   		<h1>없는 번호 입니다.</h1>
   		</c:if>
   		
   	</div>
   	


	<c:import url="../temps/bootstrap_js.jsp"></c:import> 
</body>
</html>