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


    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />

<title>난이도 고르는 페이지</title>
<style>
form div {
	border: 2px solid rgb(221, 222, 223);
	margin: 20px auto;
	padding: 6px;
	border-radius: 10px;
	font-weight: 550;
}

#mypage {
	color: #636364;
}


</style>
<link rel="stylesheet" href="${rootPath}/static/css/calender.css?20220614_002" />

</head>


<body>
	<div id="wrap">
		<!-- Header -->
		<header id="header">
			<div id="icon_solid"></div>
			<div class="content">
				<div class="inner">
					<h2>셀핏</h2>
					<h3>Do it List</h3>

					<br>
					<br>
				</div>
				
				<input id="a-box" type="radio" name="level" /> 
				<label class="abc-list" for="a-box">초급</label> 
				<input id="b-box" type="radio" name="level" /> 
				<label class="abc-list" for="b-box">중급</label>
				<input id="c-box" type="radio" name="level" /> 
				<label class="abc-list" for="c-box">상급</label>

				<ol class="a-list begin-box">
					<c:forEach items="${MENUMAPS.BEGIN}" var="MENU">
						<li><a href="${rootPath}/user/dayset/${MENU.sc_num}">일주일 ${MENU.sc_division}루틴 </a></li>
					</c:forEach>
				</ol>

				<ol class="b-list middle-box">
					<c:forEach items="${MENUMAPS.MIDDLE}" var="MENU">

						<li><a href="${rootPath}/user/dayset/${MENU.sc_num}">일주일 ${MENU.sc_division}루틴 </a></li>
						<li><a href="${rootPath}/user/dayset/${MENU.sc_num}">일주일 ${MENU.sc_division}루틴 </a></li>
					</c:forEach>
				</ol>

				<ol class="c-list adv-box">
					<c:forEach items="${MENUMAPS.ADV}" var="MENU">

						<li><a href="${rootPath}/user/dayset/${MENU.sc_num}">일주일 ${MENU.sc_division}루틴 </a></li>
					</c:forEach>
				</ol>
				<div id="height1"></div>
			</div>
		</header>
		<section>
			<p>
				먹는다고 다 살찌진 않는다.<br /> 많이 먹어서 살찔 뿐.
			</p>
		</section>

		<p><a href="${rootPath}/user/mypage" id="mypage">mypage</a></p>

		<p><a href="${rootPath}/user/mypage" id="mypage">mypage</a></p>
		<footer>
			<a href="${rootPath}/user">첫화면</a>
		</footer>
	</div>
</body>
</html>
