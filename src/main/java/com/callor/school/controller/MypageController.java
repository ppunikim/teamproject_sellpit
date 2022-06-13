package com.callor.school.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.callor.school.model.MypageVO;
import com.callor.school.pesistance.MypageDao;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@RequestMapping(value = "/user")
@Controller
public class MypageController {

	@Autowired
	private MypageDao mypageDao;

	@RequestMapping(value = "/mypage", method = RequestMethod.GET)
	public String mypage(Model model) {
		log.debug("첫 번째");
		Date date = new Date(System.currentTimeMillis());
		log.debug("두 번째");
		SimpleDateFormat dayFormat = new SimpleDateFormat("yyyy-MM-dd");
		log.debug("세 번째");
		MypageVO mypageVO = MypageVO.builder().my_date(dayFormat.format(date)).build();
		log.debug("네 번째");
		model.addAttribute("MYPAGE",mypageDao);
		log.debug("다섯 번째");
		
		return null;
	}

}
