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
<title>mypage</title>
<style>
a.last {
	text-decoration: none;
	color: rgb(200, 199, 199);
}

button:nth-of-type(2) {
	margin: 0 10px;
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
		<form method="GET">
			<div>
				<input type="date" name="my_date" id="calenderdate" />
			</div>
			<input type="text" placeholder="day1 가슴 + 삼두" id="datedata" />
		</form>
		<table>
			<tr>
				<th>운동 종목</th>
				<th>무게</th>
				<th>set</th>
				<th>rm</th>
			</tr>
			<tr>
				<td>랫 풀다운</td>
				<th>18kg</th>
				<th>4</th>
				<th>12</th>
			</tr>
			<tr>
				<td>브이 스쿼트</td>
				<th>18kg</th>
				<th>4</th>
				<th>10</th>
			</tr>
			<tr>
				<td>트라이셉스 푸쉬다운</td>
				<th>10kg</th>
				<th>3</th>
				<th>10</th>
			</tr>
			<tr>
				<td>바이셉 컬</td>
				<th>4kg</th>
				<th>4</th>
				<th>5</th>
			</tr>
		</table>
		<section>
			<div>
				
				
			</div>
		</section>
		<footer>
			<button>
				<a href="${rootPath}/user/calender" class="last">이전 화면</a>
			</button>
			<button>
				<a href="${rootPath}/user/notion" class="notion  last">게시판</a>
			</button>
			<button>
				<a href="${rootPath}" class="last">첫 화면</a>
			</button>
		</footer>
	</div>
</body>
</html>
