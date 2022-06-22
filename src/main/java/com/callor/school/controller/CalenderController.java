package com.callor.school.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.callor.school.config.DietConfig;
import com.callor.school.config.QualifierConfig;
import com.callor.school.model.UserVO;
import com.callor.school.service.SelfitService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping(value = "/user")
public class CalenderController {

	private final SelfitService selfitService;

	public CalenderController(@Qualifier(QualifierConfig.SERVICE.SELFIT_V2) SelfitService selfitService) {
		this.selfitService = selfitService;
	}

	@RequestMapping(value = "/calender", method = RequestMethod.GET)
	public String home(Model model, HttpSession session) {

		selfitService.startPage(model);
		log.debug((String) model.getAttribute("BEGIN_MENU").toString());

		int length = DietConfig.MESSAGE.length;

		
		int rndNum = (int)(Math.random() * length);

		String msg = DietConfig.MESSAGE[rndNum];

		model.addAttribute("MESSAGE", msg);

		
		
		UserVO userVO = UserVO.builder()
							.username("게스트")
							.password("게스트")
							.name("게스트")
							.role("게스트")
							.email("게스트")
							.gender("게스트").build();
		
		session.setAttribute("GUEST", userVO);
		return "user/calender";
	}

}
