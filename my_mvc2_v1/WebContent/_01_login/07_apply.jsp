<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>입사지원페이지</title>
</head>
<body>
	<c:if test="${sessionScope.mdto.getId() eq null }">
		<script>
			alert("로그인을 먼저해야합니다.");
			location.href="login.do";
		</script>
	</c:if>
	<c:if test="${sessionScope.mdto.getField() ne null }">
		<script>
			alert("수정만 가능합니다.");
			location.href="index.do";
		</script>
	</c:if>
	
	<div align="center">
		<h2>입사지원 페이지입니다. </h2>
		<h4>개발에 열정을 가진 인재를 기대합니다. </h4>
	</div>
	<hr>
	
	<div align="center">
		<h3>개인정보</h3>
		이름<input type="text" id="name" name="name" value="${mdto.getName() }" disabled><br>
		전화번호<input type="text" id="tel" name="tel" size="20" value="${mdto.getTel() }" disabled><br>
		이메일<input type="email" id="email" name="email" value="${mdto.getEmail() }" disabled><br>
	</div>
	<hr>
	
	<div align="center">
		<h2>이력서</h2>
		<form action="applyAction.do" method = "post">
			<input type="hidden" id="id" name="id" value="${mdto.getId() }">
			<h3>지원분야</h3>
			<input type="radio" name="field" value="web-publisher" />web-publisher
			<input type="radio" name="field" value="front-end" />front-end
			<input type="radio" name="field" value="web-developer" />web-developer<br>
			
			<h3>기술능력</h3>
			<input type="checkbox" name="skill" value="html"/>html
			<input type="checkbox" name="skill" value="css"/>css
			<input type="checkbox" name="skill" value="javascript"/>javascript
			<input type="checkbox" name="skill" value="java"/>java
			<input type="checkbox" name="skill" value="jsp"/>jsp
			<input type="checkbox" name="skill" value="spring"/>spring<br>
			
			<h3>전공분야</h3>
			<select name="major" id="major">
				<option >컴퓨터공학과</option>
				<option>전기공학과</option>
				<option>기계공학과</option>
				<option>산업공학과</option>
			</select><br>
			<br>
			<input type="submit" value="제출하기">
			<input type="reset" value="다시쓰기">
		</form>
	</div><hr>

</body>
</html>