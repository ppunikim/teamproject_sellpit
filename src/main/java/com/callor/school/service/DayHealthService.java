package com.callor.school.service;

import java.util.List;

import com.callor.school.model.DayHealthVO;
import com.callor.school.model.UserVO;
import com.callor.school.pesistance.DayHealthDao;

public interface DayHealthService extends DayHealthDao{
	
	public int insert(DayHealthVO dayHealthVO, UserVO userVO);
	public List<DayHealthVO> findByUsers(String my_username);
	
	
}
