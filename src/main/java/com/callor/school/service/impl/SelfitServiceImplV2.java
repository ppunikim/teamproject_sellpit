package com.callor.school.service.impl;


import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.callor.school.config.QualifierConfig;
import com.callor.school.model.StartMenuDTO;
import com.callor.school.model.WorkOutDTO;
import com.callor.school.pesistance.SelfitDao;

@Service(QualifierConfig.SERVICE.SELFIT_V2)
public class SelfitServiceImplV2 extends SelfitServiceImplV1{

	public SelfitServiceImplV2(SelfitDao selfitDao) {
		super(selfitDao);
	}//end 생성자
	
	@Override
	public void startPage(Model model) {

		//List<StartMenuDTO> startMenus = selfitDao.selectStartMenu();
		
		List<StartMenuDTO> beginMenus = selfitDao.selectByScNum("01");
		List<StartMenuDTO> middleMenus = selfitDao.selectByScNum("02");
		List<StartMenuDTO> advMenus = selfitDao.selectByScNum("03");
		
		model.addAttribute("BEGIN_MENU",beginMenus);
		model.addAttribute("MIDDLE_MENU",middleMenus);
		model.addAttribute("ADV_MENU",advMenus);
		
		/*
		 * for(StartMenuDTO dto : startMenus) {
		 * if(dto.getSc_num().substring(0,2).equals("01")) { beginMenus.add(dto); } else
		 * if (dto.getSc_num().substring(0,2).equals("02")) { middleMenus.add(dto); }
		 * else if(dto.getSc_num().substring(0,2).equals("03")) { advMenus.add(dto); } }
		 */
		
		/*
		 * Map<String, List<StartMenuDTO>> menuMaps = new HashMap<>();
		 * menuMaps.put("BEGIN", beginMenus); menuMaps.put("MIDDLE", middleMenus);
		 * menuMaps.put("ADV", advMenus); model.addAttribute("MENUMAPS", menuMaps);
		 */
	}//end startPage()

	@Override
	public void getDaySetList(Model model, String sc_num) {
		super.getDaySetList(model, sc_num);
		List<StartMenuDTO> dayList 
						= (List<StartMenuDTO>) model.getAttribute("DAYS");
		String sc_id = dayList.get(0).getSc_id();
		
		List<WorkOutDTO> workList = selfitDao.selectWorkOut(sc_id);
		model.addAttribute("WORKS",workList);
	}//endDaySetList()
	
	
	@Override
	public void getDaySetList(Model model, String sc_num, String sc_id) {
		// TODO Auto-generated method stub
		super.getDaySetList(model, sc_num);
		List<WorkOutDTO> workList = selfitDao.selectWorkOut(sc_id);
		model.addAttribute("WORKS",workList);
	}//endGetDaySetList

	@Override
	public WorkOutDTO getDayHealth(String sc_id, String listid) {
		return selfitDao.selectDayHealth(sc_id, listid);
	}
	
	
	
}//end class




