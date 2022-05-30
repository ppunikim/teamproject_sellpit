<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set value="${pageContext.request.contextPath}" var="rootPath" />

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />

<title>mypage</title>
<style>
a.last {
	text-decoration: none;
	color: rgb(200, 199, 199);
}
</style>
<link rel="stylesheet" href="${rootPath}/static/css/mypage.css" />
</head>

<body>
	<div id="wrap">
		<header>
			<h2>마이페이지</h2>
		</header>
		<form>
			<div>
				<input type="date" name="calender" id="calenderdate" />
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
			<p>
				우리가 늙어서 <br />운동을 그만두는 것이 아니라,<br /> 우리가 운동을 <br />그만두기 때문에 늙는
				것이다.
			</p>
			<h1>오늘 총 운동시간 : 1h 30m</h1>
		</section>
		<footer>
			<button>
				<a href="KIM/3dayHealth-day1-easy05.html" class="last">이전 화면</a>
			</button>
			<button>
				<a href="main.html" class="last">첫 화면</a>
			</button>
		</footer>
	</div>
</body>
</html>
