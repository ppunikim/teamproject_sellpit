package com.callor.school.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.callor.school.service.SelfitService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping(value="/user")
public class CalenderController {

	private final SelfitService selfitService;
	public CalenderController(SelfitService selfitService) {
		this.selfitService = selfitService;
	}
	
	@RequestMapping(value = "/calender", method = RequestMethod.GET)
	public String home(Model model) {
		
		selfitService.startPage(model);
		log.debug((String) model.getAttribute("MENUMAPS").toString());
		return "user/calender";
	}
	
	
}
