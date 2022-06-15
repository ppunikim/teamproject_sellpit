package com.callor.school.pesistance;

import com.callor.school.model.DayHealthVO;
import com.callor.school.model.UserVO;

public interface DayHealthDao extends GenericDao<DayHealthVO, String>{
	
	public void create_mypage_dayhealth();
	public int insert(DayHealthVO dayHealthVO, UserVO userVO);
}
