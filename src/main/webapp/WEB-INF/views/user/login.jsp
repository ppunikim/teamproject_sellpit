<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set value="${pageContext.request.contextPath}" var="rootPath" />

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
form, div.login_info {
	width: 60%;
	margin: 100px auto;
	padding-bottom: 30px
	
}

fieldset {
	border: 3px outset black;
	display: flex;
	flex-direction: column;
	justify-content: center;
	align-items: center;
	margin-bottom: 30px;
}

legend {
	text-align: center;
	padding: 30px;
	font-size: 25px
}

form input {
	width: 80%;
	padding: 10px;
	margin: 10px;
	border: 2px solid black; 
}
body{
background-color: pink;
}
a{
text-align:center;
text-decoration: none;
color: inherit;
padding: 20px;
margin: 20px auto;


}
a:hover{
color: white;
font-weight: bold;

}
body{
background-image: url(${rootPath}/static/images/bg.jpg);
}

button{
background-color: black; 
color: white;
width: 100px;
padding: 10px;
margin-top: 10px;



}
button:hover {
	background-color: white;
	color: black;
box-shadow: 1px 1px 1px 1px black;
	
}
.login_info{
border: 1px solid black;
text-align: center;
padding-top: 10px
}
.ss{
text-align: center;

}

</style>
</head>
<body>
	<form method="POST" autocomplete="off">
		<fieldset>
			<legend>로그인</legend>
			<input name="username" placeholder="닉네임" /> <input
				name="password" type="password" placeholder="바말번호" />
			<button>로그인</button>
		</fieldset>
		<div class="ss">
	<a href="${rootPath}/user/join">회원가입</a>
	
				<a href="${rootPath}/user/logout">로그아웃</a>
				</div>
	</form>
	<div class="login_info">
		<c:if test="${not empty USER }">
			<div>
				<b>아이디 : </b>${USER.username}</div>
			<div>
				<b>이름 : </b>${USER.name}</div>
			<div>
				<b>권한 : </b>${USER.role}</div>
			<div>
				<b>email : </b>${USER.email}</div>
			<div>
				<b>성별 : </b>${USER.gender}</div>
			
		</c:if>
		<c:if test="${empty USER}">
			<div>로그인 정보가 없습니다</div>
		</c:if>
	</div>

</body>
</html>