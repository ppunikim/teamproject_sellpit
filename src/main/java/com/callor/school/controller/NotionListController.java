package com.callor.school.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.callor.school.model.NotionVO;
import com.callor.school.pesistance.NotionDao;

@Controller(value="/user")
public class NotionListController {

	private NotionDao notionDao;
	
	
	@RequestMapping(value="/notionList", method = RequestMethod.GET)
	public String List(Model model) {
		return "user/notionList";
	}
	@RequestMapping(value="/notionList", method = RequestMethod.POST)
	public String List(NotionVO notionVO) {
		return "redirect:/user/notionList";
	}
}
