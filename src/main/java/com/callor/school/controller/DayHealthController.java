package com.callor.school.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
<<<<<<< HEAD
@Controller
@RequestMapping(value="/user")
=======

@RequestMapping(value="/user")
@Controller
>>>>>>> 6565f5041226c76c02f632702f54144567a40f62
public class DayHealthController {

	@RequestMapping(value = "/dayHealth", method = RequestMethod.GET)
	public String dayHealth(HttpSession session ) {
		
		return null;
	}
}
                   