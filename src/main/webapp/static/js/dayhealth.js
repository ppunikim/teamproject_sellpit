document.addEventListener("DOMContentLoaded", () => {
  const kg = document.querySelector(".kg");
  const rep = document.querySelector(".rep");

  const button_click = (e) => {
    if (kg.value === "") {
      kg.focus();
      return false;
    }

    if (rep.value === "") {
      rep.focus();
      return false;
    }

    window.open(`${rootPath}/user/timer`, "타이머", "width=500px,height=550px");
    e.target.style.backgroundColor = "rgb(56, 56, 164)";
    console.log(e.target);

    document.querySelector("form.send")?.submit();
  };

  const buttons = document.querySelectorAll("button.alerts");
  for (let i = 0; i < buttons.length; i++) {
    buttons[i].addEventListener("click", button_click);
  }

  //   sendcheck?.addEventListener("click", () => {
  //     if (kg.value === "") {
  //       kg.focus();
  //       return false;
  //     }

  //     if (rep.value === "") {
  //       rep.focus();
  //       return false;
  //     }
  //     document.querySelector("form.send")?.submit();
  //   }); //end click이벤트
}); //end 맨 위 코드
