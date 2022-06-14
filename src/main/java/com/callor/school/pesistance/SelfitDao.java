package com.callor.school.pesistance;

import java.util.List;

import com.callor.school.model.StartMenuDTO;
import com.callor.school.model.WorkOutDTO;

public interface SelfitDao {

	public List<WorkOutDTO> workOutView();
	public List<StartMenuDTO> selectStartMenu();
	public List<StartMenuDTO> selectDaySet(String sc_num);
	
}
