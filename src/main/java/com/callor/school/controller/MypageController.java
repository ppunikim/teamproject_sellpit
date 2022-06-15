package com.callor.school.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.callor.school.config.DietConfig;
import com.callor.school.model.MypageVO;
import com.callor.school.pesistance.MypageDao;

import lombok.extern.slf4j.Slf4j;
@RequestMapping(value = "/user")
@Controller
public class MypageController {

	@Autowired
	private MypageDao mypageDao;

	@RequestMapping(value = "/mypage", method = RequestMethod.GET)
	public String mypage(Model model) {
		Date date = new Date(System.currentTimeMillis());
		SimpleDateFormat dayFormat = new SimpleDateFormat("yyyy-MM-dd");
		MypageVO mypageVO = MypageVO.builder().my_date(dayFormat.format(date)).build();
		model.addAttribute("MYPAGE",mypageDao);
		
		int length = DietConfig.MESSAGE.length;
		
		int rndNum = (int)(Math.random() * length);
		String msg = DietConfig.MESSAGE[rndNum];
		
		model.addAttribute("MESSAGE",msg);
		
		return null;
	}

}
