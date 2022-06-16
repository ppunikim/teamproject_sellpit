package com.callor.school.pesistance;

import java.util.List;

import com.callor.school.model.GuidVO;

public interface GuidDao extends GenericDao<GuidVO, String>{
	public List<GuidVO> getGuid(String listid);
}
