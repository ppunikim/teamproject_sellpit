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
<title>DaySet page</title>
<style>
body {
	background-image: url(${rootPath}/static/images/bg.jpg);
}
</style>
</head>
<link rel="stylesheet" href="${rootPath}/static/css/dayset.css" />
<body>
	<header>
		<h2>일주일 운동</h2>
		<%-- <h2>
		<c:forEach items="${MENUMAPS.ADV}" var="MENU">
			<li><a href="${rootPath}/user/dayset/${MENU.sc_num}">일주일 ${MENU.sc_division}루틴 </a></li>
		</c:forEach>
		</h2> --%>
		<select id="play" name="dayset">
		<c:forEach items="${DAYS}" var="DAY">
			<option>${DAY.sc_day} ) ${DAY.sc_part}</option>
		</c:forEach>
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
			
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			</tr>
		</table>
	</section>
	<footer class="team">
		<a href="${rootPath}/user/calender">이전</a> <a href="${rootPath}/user/dayHealth">다음</a>
	</footer>
</body>
</html>