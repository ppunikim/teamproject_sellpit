package com.callor.school.pesistance;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.callor.school.model.StartMenuDTO;
import com.callor.school.model.WorkOutDTO;

public interface SelfitDao {

	public List<WorkOutDTO> workOutView();
	public List<StartMenuDTO> selectStartMenu();
	public List<StartMenuDTO> selectDaySet(String sc_num);
	
	//메뉴 가져오기 위한 것.
	public List<StartMenuDTO> selectByScNum(String sc_num);
	public List<WorkOutDTO> selectWorkOut(String sc_id);
	public WorkOutDTO selectDayHealth( //param값은 mapper와 연동되는 이름이앋.
			@Param("sc_id") String sc_id,
			@Param("sc_listid") String listid);
	
}
