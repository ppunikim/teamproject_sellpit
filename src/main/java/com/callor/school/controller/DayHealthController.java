package com.callor.school.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@RequestMapping(value="/user")
@Controller
public class DayHealthController {

	@RequestMapping(value = "/dayHealth", method = RequestMethod.GET)
	public String dayHealth(HttpSession session ) {
		
		return null;
	}
}
                   