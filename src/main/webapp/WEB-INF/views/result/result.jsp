<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<script type="text/javascript">
	let result= ${requestScope.result};
	if(result > 0) alert("등록 성공")
	else alert("등록 실패")
	
	location.href="list	";
</script>
</body>
</html>