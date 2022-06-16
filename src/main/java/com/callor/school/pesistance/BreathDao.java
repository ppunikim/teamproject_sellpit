package com.callor.school.pesistance;

import java.util.List;

import com.callor.school.model.BreathVO;

public interface BreathDao extends GenericDao<BreathVO, String>{
	public List<BreathVO> getBreath(String listid);
}
