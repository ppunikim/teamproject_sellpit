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


body {
	background-image: url("${rootPath}/static/images/bg.jpg");
}
</style>
<link rel="stylesheet" href="${rootPath}/static/css/login_ok.css" />
</head>
<body>

	<h3>${LOGIN.message}</h3>

	<c:choose>
		<c:when test="${LOGIN_MESSAGE == 'USERNAME FAIL' }">
			<h2>USER NAME(사용자 ID) 가 없습니다</h2>
			<a href="${rootPath}/user/login">로그인 다시 하기</a>
			<a href="${rootPath}">홈으로 가기</a>
		</c:when>
		<c:when test="${LOGIN_MESSAGE == 'PASSWORD FAIL' }">
			<h2>비밀번호가 잘못되었습니다</h2>
			<a href="${rootPath}/user/login">로그인 다시 하기</a>
			<a href="${rootPath}">홈으로 가기</a>
		</c:when>
		<c:otherwise>
			<c:if test="${not empty USER}">
				<%-- <h3>로그인 성공!!!</h3>
				<p><strong>USERNAME : </strong>${USER.username}</p>
				<p><b>NAME : </b>${USER.name}</p>
				<p><b>email : </b>${USER.email}</p>
				<a href="${rootPath}/">홈으로</a> --%>
				<div id="wrap">
					<!-- Header -->
					<header id="header">
						<div class="logo">
							<span class="icon"><img src="${rootPath}/static/images/do it list.png"
								alt="" /></span>
						</div>
						<div id="icon_solid"></div>
						<div class="content">
							<div class="inner">
								<h1>${USER.username} 님</h1>

							</div>
						</div>
						<div id="icon_solid1"></div>
						<nav>
							<ul>
								<li><a href="${rootPath}/user/calender">운동 시작</a></li>
								<li><a href="${rootPath}/user/mypage">마이페이지</a></li>
							</ul>
						</nav>
					</header>
					<footer>
						<p class="team">제작 : 나준희, 임효선, 김햇살</p>
					</footer>
			</c:if>
		</c:otherwise>
	</c:choose>




	
</body>
</html>