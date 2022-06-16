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
a.last {
	text-decoration: none;
	color: rgb(200, 199, 199);
}

button:nth-of-type(2) {
	margin: 0 10px;
}
button:hover{
background-color: white;
color: black;
}


div {
	margin-top: 20px;
	border: 1px solid black;
	display: inline-block;
	padding: 20px;
	border-radius: 5px ;
	
}
table {
   border-collapse: collapse;
    box-shadow: 0 0 20px rgba(0, 0, 0, 0.1);
    font-size: 90%;
    text-align: center;
    table-layout: fixed;
   margin: 10px auto;
   width: 70%;
   
}
table th, td {
    padding: 15px;
    border-bottom: 1px solid rgba(14, 13, 13, 0.2);
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
		<table >
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
		<section>

			<div>${MESSAGE}</div>
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
