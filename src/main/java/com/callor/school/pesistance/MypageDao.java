package com.callor.school.pesistance;

import com.callor.school.model.MypageVO;

public interface MypageDao extends GenericDao<MypageVO, String>{
	
	public void create_mypage_table();
}
