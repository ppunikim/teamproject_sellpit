package com.callor.school.pesistance;

import java.util.List;

import com.callor.school.model.DaySetVO;

public interface DaySetDao extends GenericDao<DaySetVO, String> {

	public List<DaySetVO> findByUsername(String username);
}
