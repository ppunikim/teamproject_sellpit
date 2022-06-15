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
button {
	width: 20px;
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
				<br />랫 풀다운은 등근육 운동에서도 초급자가 하기 좋은 운동이에요.<br /> 초급자가 처음에 도전하기 좋고
				탄탄함을 높여주기 괜찮은 운동이라서 등운동이 처음인분들에게는 랫풀다운을 추천드려요. <br /> <br />
				<h4>운동 가이드</h4>
				<br /> 1. 어깨너비보다 조금 넓게 바를 잡아주세요.<br /> 2. 팔꿈치가 뒤로 빠지는 것이 아니라 바닥을
				찍는다는 생각 으로 바를 당겨주세요.<br /> 3. 당기는 위치는 배 쪽이 아닌 쇄골 쪽으로 당겨주세요.<br />
				4. 어깨와 팔을 완전하게 펴면 어깨에 무리가 갈수 있으니 주의해주세요.<br /> <br />
				<h4>호흡법</h4>
				<br /> 1. 힘을 뺀 후 숨을 들이마십니다.<br /> 2. 내려온 최고 정점에서 호흡을 뱉고 다시 , 흡입한
				상태에 서 올라갔다가 내쉬고를 반복합니다.
			</div>
		</header>
		<section>
			<div>
				<img src="${rootPath}/static/images/dayHealth/letpulldown.png">
			</div>
		</section>
		<section>
			<div>
				<div>
					<h4>** 세트가 끝날 때마다 체크를 눌러주세요. **</h4>
				</div>
<<<<<<< HEAD
				<c:forEach begin="1" end="${HEALTH.sl_set}" varStatus="INDEX">
					<div class="healthpage list">
						<span>${INDEX.count} set )</span>
						<input placeholder="${HEALTH.sl_weight}"><label>kg</label>
						<input placeholder="${HEALTH.sl_rep}"><label>회</label>
						<input type="button" value="체크" class="alerts">
					</div>
				</c:forEach>
=======
				<form method="POST">
					<div class="healthpage">
						<div> set )</div>
						<input type="text" name="my_weight" placeholder="18" />
						<div>kg</div>
						<input type="text" name="my_rep" placeholder="10~12" />
						<div>회</div>
						<button type="submit" value="체크" class="alerts">체크</button>
					</div>
					<!-- <div class="healthpage">
						<div>2 set )</div>
						<input type="text" name="my_weight" placeholder="18" />
						<div>kg</div>
						<input type="text" name="my_rep" placeholder="10~12" />
						<div>회</div>
						<button type="submit" value="체크" class="alerts">체크</button>
					</div>
					<div class="healthpage">
						<div>3 set )</div>
						<input type="text" name="my_weight" placeholder="18" />
						<div>kg</div>
						<input type="text" name="my_rep" placeholder="10~12" />
						<div>회</div>
						<button type="submit" value="체크" class="alerts">체크</button>
					</div>
					<div class="healthpage">
						<div>4 set )</div>
						<input type="text" name="my_weight" placeholder="18" />
						<div>kg</div>
						<input type="text" name="my_rep" placeholder="10~12" />
						<div>회</div>
						<button type="submit" value="체크" class="alerts">체크</button>
					</div> -->
				</form>
>>>>>>> 8a6a63bfd4290a424950362afc91f32d763a8f16
			</div>
		</section>
	</div>
</body>

</html>