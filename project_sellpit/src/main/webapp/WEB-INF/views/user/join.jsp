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
form.join {
	width: 60%;
	margin: 100px auto;
}

form.join fieldset {
	border: 3px solid black;
}

form div {
	display: flex;
	margin: 10px auto;
}

form input {
	flex: 1;
	padding: 8px;
	border: 2px solid black;
}

legend{
font-size: 20px;
text-align: center;
}
.warn {
	color: red;
	font-weight: 900;
	text-decoration: underline;
}

.ok {
	color: red;
}
body{
background-image: url(${rootPath}/static/images/bg.jpg);
}

button{
background-color: black;
color:white;
margin-left: 10px;
padding: 10px
}
button:hover{
color: black;
background-color: white;
}
</style>
<script>
	// js 파일에서 rootPath 을 
	// 사용할수 있도록 미리 JS 변수로 선언
	const rootPath = "${rootPath}"
</script>
<script src="${rootPath}/static/js/join.js?ver=2022-05-28"></script>
</head>
<body>
	<form class="join" autocomplete="off" method="POST">
		<fieldset>
			<legend>***회원가입***</legend>
			<div>
				<input name="username" placeholder="닉네임" autocomplete="off" />
				<button class="id-check" type="button">중복검사</button>
			</div>
			<div class="username"></div>
			<div>
				<input name="password" type="password" placeholder="비밀번호" autocomplete="off" />
			</div>
			<div>
				<input name="re_password" type="password" placeholder="비밀번호확인"/>
			</div>
			<div>
				<input name="name" placeholder="이름" />
			</div>
			<div>
				<input name="email" placeholder="이메일" />
			</div>

			<div>
				<input name="gender" placeholder="성별" />
			</div>
			<div>
				<button type="button" class="join">회원가입</button>
				<button type="reset">새로작성</button>
			</div>
		</fieldset>
	</form>

</body>
</html>