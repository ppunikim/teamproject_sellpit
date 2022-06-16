<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set value="${pageContext.request.contextPath}" var="rootPath" />

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width,initial-scale=1.0,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no,viewport-fit=cover">
<!-- ios에서 전화번호가 링크화되는 것 방지 -->
<meta name="format-detection" content="telephone=no">
<title>SELLFIT</title>
<style>
body{
background-image: url(${rootPath}/static/images/bg.jpg);
}
h2 {
	text-align: center;
	margin-top: 80px;
}
fieldset {
	margin-top: 30px;
	border:3px solid  #545354;
	border-radius: 20px;
}
form.bbs_write {
	width: 80%;
	margin: 10px auto;
	
}

form.bbs_write h2, form.bbs_write input, form.bbs_write textarea {
	width: 90%;
	margin: 5px auto;
	padding: 8px;
}
form button {
	padding: 10px;
    color: rgb(200, 199, 199);
    background-color: rgb(45, 45, 45);
    border-radius: 4px;
}
footer{
    margin-top: 20px;
    border-radius: 10px;
    padding: 6px;
    text-align: center;
    width: 130px;
    margin: 0 auto;
}
footer a {
    text-decoration: none;
    color: rgb(201 201 201); 
}
</style>
</head>
<body>
<header>
	<h2>sellfit 게시판</h2>
</header>
	<form method="POST" class="bbs_write">
		<fieldset>
		<input name="no_date" type="date" value="${NOTION.no_date}">
		<input name="no_time" type="time" value="${NOTION.no_time}">
		<input name="no_writer" placeholder="작성자" value="${NOTION.no_writer}">
		<input name="no_subject" placeholder="제목" value="${NOTION.no_subject}">
		<textarea rows="5" cols="20" name="no_content" placeholder="내용" ></textarea>
		<!-- <input type="file" name="file" accept="image/*"> -->
		<button>저장</button>
		</fieldset>
	</form>
	<footer>
		<a href="${rootPath}/user/mypage">마이페이지</a>
	</footer>
</body>
</html>