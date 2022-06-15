package com.callor.school.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.callor.school.config.QualifierConfig;
import com.callor.school.model.WorkOutDTO;
import com.callor.school.service.SelfitService;

@RequestMapping(value="/user")
@Controller
public class SelfitController {
	
	private final SelfitService selfitService;
	public SelfitController(@Qualifier(QualifierConfig.SERVICE.SELFIT_V2)
									   SelfitService selfitService) {
		this.selfitService = selfitService;
	}//end 생성자
	
	@RequestMapping(value="/dayset/{sc_num}",method = RequestMethod.GET)
	public String daySet(@PathVariable("sc_num") String sc_num, Model model) {
		selfitService.getDaySetList(model,sc_num);
		return "/user/dayset";
	}
	
	@RequestMapping(value="/dayset/{sc_num}/{sc_id}",method = RequestMethod.GET)
	public String daySet(
				@PathVariable("sc_num") String sc_num, 
				@PathVariable("sc_id") String sc_id, 
				Model model) {
		selfitService.getDaySetList(model,sc_num,sc_id);
		return "/user/dayset";
	}
	
	@RequestMapping(value="/dayHealth/{sc_id}/{list_id}")
	public String dayHealth(@PathVariable("list_id") String listid,
							@PathVariable("sc_id") String sc_id,
							Model model) {
		
		WorkOutDTO health= selfitService.getDayHealth(sc_id, listid);
		model.addAttribute("HEALTH", health); 
		return "user/dayHealth";
	}
	
}//end class