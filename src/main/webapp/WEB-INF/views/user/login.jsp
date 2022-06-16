<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set value="${pageContext.request.contextPath}" var="rootPath" />

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>SELLFIT</title>
<style>

body {
background-image: url(${rootPath}/static/images/bg.jpg);
}
form, div.login_info {
	width: 330px; 
	margin: 100px auto;
	padding-bottom: 30px;
	text-align: center;
	
}

fieldset {
	border: 30px solid transparent;
	display: flex; 
	flex-direction: column;
	justify-content: center;
	align-items: center;
	margin-bottom: 30px;
	border-radius: 10px;
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
	border: 2px solid #6f6969; 
}
form {
	margin-bottom: 100px;
}
body {
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

button{
background-color:#1c1a1d; 
color: white;
width: 100px;
padding: 10px;
margin-top: 10px;
border-radius: 40px;



}
button:hover {
	background-color: #e4dfdf;
	color: #5f5f5f;
box-shadow: 0.5px 0.5px 1px 1px black;
}
.login_info{
border: 1px solid transparent;
background-color: #212121; 
color: white;
padding-top: 10px;
border-radius: 10px;
}

.ss{
text-align: center;

}

</style>
</head>
<body>
<div class="background">
	<form method="POST" autocomplete="off">
		<fieldset>
			<legend>로그인</legend>
			<input name="username" placeholder="닉네임" /> <input
				name="password" type="password" placeholder="바말번호" />
			<button>로그인</button>
		</fieldset>
		<div class="ss">
	<a href="${rootPath}/user/join">회원가입</a>
	
			
				</div>
	</form>
	<div class="login_info">
		<c:if test="${not empty USER}">
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
		<c:if test="${empty USER}" >
			<div id="login_info">로그인 정보가 없습니다</div>
		</c:if>
	</div>
	</div>
</body>
</html>
