<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set value="${pageContext.request.contextPath}" var="rootPath" />

<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>1.랫 풀다운</title>
<style>
body {
	background-image: url(${rootPath}/static/images/bg.jpg);
}
button:last-of-type {
	width: 50px;
	height: 20px;
}
</style>
<script type="text/javascript">

        const button_click = (e) =>{
            window.open("${rootPath}/user/timer", "타이머", "width=500px,height=550px")
            e.target.style.backgroundColor = "rgb(56, 56, 164)"
            console.log(e.target)
        }

        document.addEventListener("DOMContentLoaded",()=>{
            const buttons = document.querySelectorAll("button.alerts")
            for(let i = 0 ; i < buttons.length ; i++) {
                buttons[i].addEventListener("click",button_click)
            }
        })

</script>
</head>
<link rel="stylesheet"
	href="${rootPath}/static/css/dayHealth.css?ver=2022-06-08-005">
<body>
	<div id="wrap">
		<header>
			<section class="health">
				<h2>${HEALTH.list_name}</h2>

			</section>
			<input id="guide" type="checkbox" /> <label class="guidecheck"
				for="guide"><div class="blankbutton">운동 가이드</div></label>
			<div class="check1">
				<h4>운동 설명</h4>
				<c:forEach items="${EXP}" var="EE">
				${EE.ex_content}<br>
				
				</c:forEach>
				<h4>운동 가이드</h4>
				<c:forEach items="${GUID}" var="GG">
				${GG.gd_content}<br>
				
				</c:forEach>
				<h4>호흡법</h4>
				<c:forEach items="${BRE}" var="BB">
				${BB.br_contenth}<br>
				
				</c:forEach>
			</div>
		</header>
		<section>
			<div>
				<img src="${rootPath}/static/images/${HEALTH.sl_listid}.jpg">
			</div>
		</section>
		<section>
			<div>
				<div>
					<h4>** 세트가 끝날 때마다 체크를 눌러주세요. **</h4>
				</div>


				<c:forEach begin="1" end="${HEALTH.sl_set}" varStatus="INDEX">
					<div class="healthpage list">
						<span>${INDEX.count} set )</span>
						<form action="${rootPath}/user/dayHealth" method="POST">
						<input name="my_dayset" type="hidden" value="${INDEX.count}">
						<input name="my_list" type="hidden" value="${HEALTH.list_name}">
						<input name="sc_id" type="hidden" value="${HEALTH.sl_scid}">
						<input name="sl_listid" type="hidden" value="${HEALTH.sl_listid}">
						<input placeholder="${HEALTH.sl_weight}" name="my_weight"><label>kg</label>
						<input placeholder="${HEALTH.sl_rep}" name="my_rep"><label>회</label>
						<button class="alerts">체크</button>
						</form> 
					</div>
				</c:forEach>


			</div>
		</section>
	</div>
</body>

</html>