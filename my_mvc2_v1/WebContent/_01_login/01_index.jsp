<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메인페이지2</title>
</head>
<body>

	<div align = "center">
		<c:if test="${null ne id }">
			${id }님, 환영합니다<br><br>
			<a href="update.do">입사지원정보수정</a><br>
			<a href="logout.do">로그아웃</a><br>
			<a href="delete.do">탈퇴</a><br>
		</c:if>
		<c:if test="${null eq id }">
			<a href="join.do">회원가입</a><br>
			<a href="login.do">로그인</a><br>
		</c:if>
	</div>
	<hr><br>
	<div align = "center">
	<a href="apply.do"><img alt="입사지원하기이미지" src="img/applyonline.png"></a>
	</div>

</body>
</html>