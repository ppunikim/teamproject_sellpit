package com.callor.school.controller;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.callor.school.config.QualifierConfig;
import com.callor.school.model.BreathVO;

import com.callor.school.model.DayHealthVO;
import com.callor.school.model.ExpVO;
import com.callor.school.model.GuidVO;
import com.callor.school.model.UserVO;
import com.callor.school.model.WorkOutDTO;
import com.callor.school.service.BreathService;
import com.callor.school.service.DayHealthService;
import com.callor.school.service.ExpService;
import com.callor.school.service.GuidService;
import com.callor.school.service.SelfitService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequestMapping(value="/user")
@Controller
public class SelfitController {
	

	@Autowired
	private GuidService guidService;
	@Autowired
	private ExpService expService;
	@Autowired
	private BreathService breathService; 
	@Autowired
	private DayHealthService dayhealthService; 
	
	
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
	public String dayHealth(HttpSession session,
							@PathVariable("list_id") String listid,
							@PathVariable("sc_id") String sc_id,
							Model model) {
		UserVO userVO = (UserVO) session.getAttribute("USER");
		WorkOutDTO health= selfitService.getDayHealth(sc_id, listid);
		Date date = new Date(System.currentTimeMillis());
		SimpleDateFormat dayFormat = new SimpleDateFormat("yyyy-MM-dd");
		
		 List<GuidVO> GVO = guidService.getGuid(listid);
		 List<ExpVO> EXP = expService.getExp(listid);
		 List<BreathVO> BRE = breathService.getBreath(listid);

		 List<DayHealthVO> dayList = dayhealthService.findByUsersDate(userVO.getUsername(),dayFormat.format(date));
		 log.debug("========================");
		 log.debug(dayList.toString());
		 log.debug("========================");
		 model.addAttribute("LIST_NAME",dayList);
		 model.addAttribute("HEALTH", health); 
		 model.addAttribute("GUID", GVO);
		 model.addAttribute("EXP", EXP); 
		 model.addAttribute("BRE", BRE); 

		model.addAttribute("HEALTH", health); 
		
		return "user/dayHealth";
	}
	
	
}//end class
