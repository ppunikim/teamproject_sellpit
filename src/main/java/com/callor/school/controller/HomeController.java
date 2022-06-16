package com.callor.school.controller;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.callor.school.config.DietConfig;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class HomeController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {

		log.debug("여기는 HOME이야.");

		int length = DietConfig.MESSAGE.length;

		int rndNum = (int) (Math.random() * length);

		String msg = DietConfig.MESSAGE[rndNum];

		model.addAttribute("MESSAGE", msg);

		return "home";
	}

}
