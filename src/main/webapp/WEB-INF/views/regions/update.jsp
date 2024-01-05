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
	
		<section id="contents" class = "container-fluid">
			<div class="row">
				<form action = "update" method="post">
				  <input type="hidden" name="region_id" value="${update_dto.region_id }">
				  <div class="mb-3">
				    <label for="regionName" class="form-label">region_Name</label>
				    <input type="text" class="form-control" id="regionName" name="region_name" value="${update_dto.region_name}">
				  </div>
				  
				  <button type="submit" class="btn btn-primary">Update</button>
</form>	
			
		 	</div>
		
		</section>
	
	
	<c:import url="../temps/bootstrap_js.jsp"></c:import> 

</body>
</html>