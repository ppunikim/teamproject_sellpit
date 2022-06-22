package com.callor.school.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.callor.school.model.NotionVO;
import com.callor.school.service.NotionService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping(value="/user")
public class NotionController {
	


	private final NotionService notionService;
	public NotionController(NotionService notionService) {
		this.notionService = notionService;
	}
	
	@RequestMapping(value="/notion", method=RequestMethod.GET)
	public String write(Model model) {
		
		Date date = new Date(System.currentTimeMillis());
		SimpleDateFormat dayFormat = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
		
		NotionVO notionVO = NotionVO.builder().no_date(dayFormat.format(date))
									.no_time(timeFormat.format(date))
									.no_writer("")
									.build();
		model.addAttribute("NOTION", notionVO);
		return "user/notion";
	}
	
	  @RequestMapping(value="/notion", method=RequestMethod.POST) 
	  public String write(NotionVO notionVO) { 
		  int ret = notionService.insert(notionVO);
		  return "redirect:/user/notionList"; 
	  }
	 
		@RequestMapping(value="/notionList", method = RequestMethod.GET)
		public String List(Model model) {
			log.debug("여기ㅏ"+ notionService.selectAll());
			List<NotionVO> notionList = notionService.selectAll();
			model.addAttribute("NOTIONLIST", notionList);
			return null;
		}
//		@RequestMapping(value="/notionList", method = RequestMethod.POST)
//		public String List(NotionVO notionVO) {
//			return "redirect:/user/notionList";
//		}

	
	
}
