package com.callor.school.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.callor.school.model.DayHealthVO;
import com.callor.school.model.UserVO;
import com.callor.school.pesistance.DayHealthDao;
import com.callor.school.service.DayHealthService;
@Service
public class DayHealthServiceImplV1 implements DayHealthService{
	
	@Autowired
	private DayHealthDao dayhealthDao;
	
	
	@Override
	public void create_mypage_dayhealth() {
		dayhealthDao.create_mypage_dayhealth();
	}

	@Override
	public List<DayHealthVO> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DayHealthVO findById(String id) {
		DayHealthVO dayhealthVO = dayhealthDao.findById(id);
		return dayhealthVO;
	}

	@Override
	public int insert(DayHealthVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(DayHealthVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Transactional
	@Override
	public int insert(DayHealthVO dayHealthVO, UserVO userVO) {
		Date date = new Date(System.currentTimeMillis());
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		DayHealthVO dayhealthVO = DayHealthVO.builder()
									.my_date(dateFormat.format(date))
									.my_username(userVO.getName())
									.my_weight(dayHealthVO.getMy_weight())
									.my_rep(dayHealthVO.getMy_rep())
									.build();
		dayhealthDao.insert(dayhealthVO);
		return 0;
	}

}
