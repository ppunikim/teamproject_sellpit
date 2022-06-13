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
<title>Insert title here</title>
<style>
body {
	background-image: url(${rootPath}/static/images/bg.jpg);
}
</style>
</head>
<link rel="stylesheet" href="${rootPath}/static/css/dayset.css" />
<body>
	<header>
		<h2>${DIBISION.sc_division}</h2>
		<select id="play">
			<option value="day1" selected="selected">${DIBISION.sc_part}</option>
			<option value="day2">day2) 등, 가슴 ,어깨 ,하체 ,이두 ,코어</option>
			<option value="day3">day3) 등 ,가슴 ,어깨 ,하체 ,삼두, 코어</option>
		</select>
		<script>
        document.addEventListener("DOMContentLoaded", () => {
          const play_select = document.querySelector("select#play");
          if (play_select) {
            console.log(play_select);

            play_select.addEventListener("change", () => {
              const value = play_select.value;
              console.log(value);
              if (value === "day1") {
                document.location.href = "./daySet01.html";
              } else if (value === "day2") {
                document.location.href = "./daySet02.html";
              } else if (value === "day3") {
                document.location.href = "./daySet03.html";
              }
            });
          }
        });
      </script>
	</header>
	<section>
		<table>
			<tr>
				<th>종목</th>
				<th>세트</th>
				<th>무게</th>
				<th>횟수</th>
			</tr>
			<tr>
				<td>랫 풀다운(등)</td>
				<td>4set</td>
				<td>18Kg</td>
				<td>8~12회</td>
			</tr>
			<tr>
				<td>인클라인 벤치 프레스(가슴)</td>
				<td>4set</td>
				<td>25kg</td>
				<td>10~12회</td>
			</tr>
			<tr>
				<td>브이스쿼트(하체)</td>
				<td>4set</td>
				<td>20kg</td>
				<td>10회</td>
			</tr>
			<tr>
				<td>트라이셉트 푸쉬다운(삼두)</td>
				<td>4set</td>
				<td>10kg</td>
				<td>10회</td>
			</tr>
			<tr>
				<td>바이셉 컬(이두)</td>
				<td>4set</td>
				<td>4kg</td>
				<td>12회</td>
			</tr>
		</table>
	</section>
	<footer class="team">
		<a href="calender.html">이전</a> <a href="dayHealth.html">다음</a>
	</footer>
</body>
</html>