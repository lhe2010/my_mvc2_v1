<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인처리</title>
</head>
<body>

	<c:if test="${isLogin eq false}">
		<script>
			alert("아이디와 비밀번호를 확인해주세요.");
			history.go(-1);
		</script>
	</c:if>

	<c:if test="${isLogin eq true}">
		<script>
			alert(${sessionScope.memId} + "님 환영합니다.");
			location.href = "index.do";
		</script>
	</c:if>

</body>
</html>