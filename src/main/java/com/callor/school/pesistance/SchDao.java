package com.callor.school.pesistance;

import java.util.List;

import com.callor.school.model.SchVO;

public interface SchDao extends GenericDao<SchVO, String>{
	public List<SchVO> idAll();

}
