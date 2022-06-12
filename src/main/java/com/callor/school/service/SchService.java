package com.callor.school.service;

import java.util.List;

import com.callor.school.model.SchVO;
import com.callor.school.pesistance.GenericDao;

public interface SchService extends GenericDao<SchVO, String>{
	public List<SchVO> idAll();
}
