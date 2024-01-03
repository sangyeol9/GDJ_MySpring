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
	
	<section>
		<form action =add method="post">
  <div class="mb-3">
    <label for="product_num" class="form-label">product_num</label>
    <input type="text" class="form-control" id="product_num" name = "productnum" >
  </div>
  <div class="mb-3">
    <label for="product_name" class="form-label">product_name</label>
    <input type="text" class="form-control" id="product_name" name = "productname">
  </div>
  <div class="mb-3">
    <label for="product_contents" class="form-label">product_contents</label>
    <input type="text" class="form-control" id="product_contents" name = "productcontents">
  </div>
  <div class="mb-3">
    <label for="product_rate" class="form-label">product_rate</label>
    <input type="text" class="form-control" id="product_rate" name = "productrate">
  </div>
  <div class="mb-3">
    <label for="product_jumsu" class="form-label">product_jumsu</label>
    <input type="text" class="form-control" id="product_jumsu" name = "productjumsu">
  </div>
 
 
  <button type="submit" class="btn btn-primary">Add</button>
</form>
	</section>
	<c:import url="../temps/bootstrap_js.jsp"></c:import>
</body>
</html>