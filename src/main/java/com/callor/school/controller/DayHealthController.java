package com.callor.school.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.callor.school.model.DayHealthVO;
import com.callor.school.model.UserVO;
import com.callor.school.service.DayHealthService;

@RequestMapping(value = "/user")
@Controller
public class DayHealthController {

	private final DayHealthService dayhealthService;

	public DayHealthController(DayHealthService dayhealthService) {
		this.dayhealthService = dayhealthService;
	}

	@RequestMapping(value = "/dayHealth", method = RequestMethod.GET)
	public String dayHealth(HttpSession session) {
		UserVO userVO = (UserVO) session.getAttribute("USER");
		return null;
	}

	@RequestMapping(value = "/dayHealth", method = RequestMethod.POST)
	public String dayHealth(HttpSession session, DayHealthVO dayhealthVO) {
		UserVO userVO = (UserVO) session.getAttribute("USER");
		int ret = dayhealthService.insert(dayhealthVO,userVO);
		return null;
	}

//	@RequestMapping(value = "/dayHealth", method = RequestMethod.POST)
//	public String dayHealth(HttpSession session, Model model) {
//		DayHealthVO dayhealthVO = dayhealthService.findById(my_seq);
//		model.addAttribute("DAYHEALTH", dayhealthVO);
//
//		return null;
//	}
	/*
	 * @RequestMapping(value = "/dayHealth", method = RequestMethod.GET) public
	 * String dayHealth() { return null; }
	 * 
	 */
}
