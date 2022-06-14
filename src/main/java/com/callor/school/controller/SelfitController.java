package com.callor.school.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.callor.school.service.SelfitService;

@RequestMapping(value="/user")
@Controller
public class SelfitController {
	
	private final SelfitService selfitService;
	public SelfitController(SelfitService selfitService) {
		this.selfitService = selfitService;
	}//end 생성자
	
	@RequestMapping(value="/dayset/{sc_num}",method = RequestMethod.GET)
	public String daySet(@PathVariable("sc_num") String sc_num, Model model) {
		
		selfitService.getDaySetList(model,sc_num);
		
		
		return "/user/dayset";
	}
	
	
	
}//end class
