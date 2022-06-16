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

td:hover {
	color: black;
}

td {
	cursor: pointer;
}

footer {
	item: center;
}

#play {
	background-color: rgba(255, 255, 255, 0.0);
	border-collapse: collapse;
	box-shadow: 0 0 20px rgba(0, 0, 0, 0.1);
	font-size: 80%;
	text-align: left;
	table-layout: fixed;
	border-bottom: 1px solid rgba(14, 13, 13, 0.2);
	border: 1px;
	
}
</style>
<script>
	const rootPath = "${rootPath}"
</script>
</head>
<link rel="stylesheet" href="${rootPath}/static/css/dayset.css" />
<body>
	<header>

		<script src="${rootPath}/static/js/dayset.js?20220615_004"></script>
		<c:forEach items="${WORKS}" var="DAYS" begin="0" end="0">
			<h2>${DAYS.sc_division}
				운동
				<h2>
		</c:forEach>
		<%-- <h2>
		<c:forEach items="${MENUMAPS.ADV}" var="MENU">
			<li><a href="${rootPath}/user/dayset/${MENU.sc_num}">일주일 ${MENU.sc_division}루틴 </a></li>
		</c:forEach>
		</h2> --%>
		<select id="play" name="dayset" class="dayset" data-sc_num="${sc_num}">
			<c:forEach items="${DAYS}" var="DAY">
				<option value="${DAY.sc_id}">${DAY.sc_day}) ${DAY.sc_part}</option>
			</c:forEach>
		</select>

	</header>
	<section>
		<table class="dayset">
			<tr>
				<th>종목</th>
				<th>세트</th>
				<th>무게</th>
				<th>횟수</th>
			</tr>
			<c:forEach items="${WORKS}" var="WORK">
				<tr data-list_id="${WORK.sl_listid}" data-sc_id="${WORK.sl_scid}">
					<td>${WORK.list_name}</td>
					<td>${WORK.sl_set}</td>
					<td>${WORK.sl_weight}</td>
					<td>${WORK.sl_rep}</td>
				</tr>
			</c:forEach>
		</table>
	</section>
	<footer class="team">
		<a href="${rootPath}/user/calender">목록으로가기</a>
	</footer>
</body>
</html>