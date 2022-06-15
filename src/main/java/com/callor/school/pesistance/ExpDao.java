package com.callor.school.pesistance;

import java.util.List;

import com.callor.school.model.ExpVO;

public interface ExpDao extends GenericDao<ExpVO, String>{
	public List<ExpVO> getExp(String listid);
}
