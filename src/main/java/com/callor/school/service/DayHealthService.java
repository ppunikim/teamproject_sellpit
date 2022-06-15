package com.callor.school.service;

import com.callor.school.model.DayHealthVO;
import com.callor.school.model.UserVO;
import com.callor.school.pesistance.DayHealthDao;

public interface DayHealthService extends DayHealthDao{
	
	public int insert(DayHealthVO dayHealthVO, UserVO userVO);
	
}
