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
html {
	background-size: cover;
	background-attachment: fixed;
}

a.last {
	text-decoration: none;
	color: rgb(200, 199, 199);
}

button:nth-of-type(2) {
	margin: 0 10px;
}

button:hover {
	background-color: white;
	color: black;
}

div {
	display: inline-block;
	padding: 20px;
	border-radius: 5px;
}

section div {
	color: #eee;
}

table {
	border-collapse: collapse;
	box-shadow: 0 0 20px rgba(0, 0, 0, 0.1);
	font-size: 90%;
	text-align: center;
	table-layout: fixed;
	margin: 10px auto;
	width: 90%;
}

table th, td {
	padding: 15px;
	border-bottom: 1px solid rgba(14, 13, 13, 0.2);
}

#tablecloth {
	overflow: scroll;
	height: 400px;
}
#message {
	margin-top: 10px;
	border-top: 1px solid #eee;
	border-bottom: 1px solid #eee;
}
</style>
<link rel="stylesheet"
	href="${rootPath}/static/css/mypage.css?ver=2022-06-14-001" />
</head>

<body>
	<div id="wrap">
		<header>
			<h2>마이페이지</h2>
		</header>
		<div id="tablecloth">
			<table>
				<tr>
					<th>날짜</th>
					<th>운동 종목</th>
					<th>무게</th>
					<th>set</th>
				</tr>


				<c:forEach items="${USERS}" var="USER">
					<tr>
						<th>${USER.my_date}</th>
						<th>${USER.my_list}</th>
						<th>${USER.my_weight}</th>
						<th>${USER.my_rep}</th>
					</tr>
				</c:forEach>
			</table>
		</div>
		<section>

			<div id="message">${MESSAGE}</div>
		</section>
		<footer>
			<button>
				<a href="${rootPath}/user/calender" class="last">난이도</a>
			</button>
			<button>
				<a href="${rootPath}/user/notion" class="notion  last">게시판</a>
			</button>
			<button onclick="history.back()" class="last">이전화면</button>
		</footer>
	</div>
</body>
</html>
