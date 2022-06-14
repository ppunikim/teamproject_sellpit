package com.callor.school.service.impl;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.callor.school.config.QualifierConfig;
import com.callor.school.model.StartMenuDTO;
import com.callor.school.pesistance.SelfitDao;
import com.callor.school.service.SelfitService;

@Service(QualifierConfig.SERVICE.SELFIT_V1)
public class SelfitServiceImplV1 implements SelfitService{

	public final SelfitDao selfitDao;
	public SelfitServiceImplV1(SelfitDao selfitDao) {
		this.selfitDao = selfitDao;
	}//end 생성자
	
	@Override
	public void startPage(Model model) {

		List<StartMenuDTO> startMenus = selfitDao.selectStartMenu();
		
		List<StartMenuDTO> beginMenus = new ArrayList<>();
		List<StartMenuDTO> middleMenus = new ArrayList<>();
		List<StartMenuDTO> advMenus = new ArrayList<>();
		
		for(StartMenuDTO dto : startMenus) {
			if(dto.getSc_num().substring(0,2).equals("01")) {
				beginMenus.add(dto);
			} else if (dto.getSc_num().substring(0,2).equals("02")) {
				middleMenus.add(dto);
			} else if(dto.getSc_num().substring(0,2).equals("03")) {
			advMenus.add(dto);
			}
		}
		
		Map<String, List<StartMenuDTO>> menuMaps = new HashMap<>();
		menuMaps.put("BEGIN", beginMenus);
		menuMaps.put("MIDDLE", middleMenus);
		menuMaps.put("ADV", advMenus);
		model.addAttribute("MENUMAPS", menuMaps);
		
	}//end startPage()

	@Override
	public void getDaySetList(Model model, String sc_num) {
		List<StartMenuDTO> daySetList = selfitDao.selectDaySet(sc_num);
		model.addAttribute("DAYS",daySetList);
	}//endDaySetList()

}//end class
