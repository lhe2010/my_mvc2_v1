<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 페이지</title>
</head>
<body>

	<div align="center">
		<h1>로그인페이지</h1>
		<h2>입사지원을 위해서는 로그인이 필요합니다. </h2>
		<hr><br>
	</div>

	<div align="center">
		<form action="loginAction.do" method="post">
			<label>아이디 : </label><input type="text" id="id" name="id" autofocus><br><br>
			<label>비밀번호 : </label><input type="password" id="pw" name="pw"><br><br>
			<input type="submit" value="로그인">
			<input type="reset" value="다시쓰기">
		</form>
	</div>

</body>
</html>