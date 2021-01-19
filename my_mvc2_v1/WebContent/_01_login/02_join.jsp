<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입페이지</title>
</head>
<body>

	<div align="center">
		<h1>회원가입</h1>
		<p>메가아카데미에 오신것을 환영합니다.</p>
		<hr>
		<form action="joinAction.do" method="post">
			<h2>로그인정보</h2>
				<label>아이디</label><input type="text" id="id" name="id" autofocus><br>
				<label>비밀번호</label><input type="password" id="pw" name="pw"><br>			
			<hr><br>
			<h2>개인정보</h2>
				<label>이름</label><input type="text" id="name" name="name" placeholder="공백없이 입력하세요"><br>
				<label>전화번호</label><input type="text" id="tel" name="tel" size="20" placeholder="000-0000-0000"><br>
				<label>이메일</label><input type="email" id="email" name="email"><br>
			<br>
			<input type="submit" value="제출하기">
			<input type="reset" value="다시쓰기">
		</form>
	</div>

</body>
</html>