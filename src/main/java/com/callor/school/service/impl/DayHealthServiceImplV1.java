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
		List<DayHealthVO> dayList = dayhealthDao.selectAll();
		return dayList;
	}

	@Override
	public DayHealthVO findById(String id) {
		DayHealthVO dayhealthVO = dayhealthDao.findById(id);
		return dayhealthVO;
	}

	@Override
	public List<DayHealthVO> findByUsers(String username) {
		List<DayHealthVO> dayList = dayhealthDao.findByUsers(username);
		return dayList;
	}

	@Override
	public List<DayHealthVO> findByUsersDate(String my_username, String my_date) {
		List<DayHealthVO> dayList = dayhealthDao.findByUsersDate(my_username, my_date);
		return dayList;
	}


	@Override
	public int insert(DayHealthVO vo) {
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
		
		dayHealthVO.setMy_date(dateFormat.format(date));
		dayHealthVO.setMy_username(userVO.getUsername());
		dayhealthDao.insert(dayHealthVO);
		return 0;
	}
	
	@Transactional
	@Override
	public int update(DayHealthVO dayHealthVO) {
		Date date = new Date(System.currentTimeMillis());
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		dayHealthVO.setMy_date(dateFormat.format(date));
		dayhealthDao.insert(dayHealthVO);
		return 0;
	}

	@Override
	public List<DayHealthVO> findByUsername(String username) {
		return dayhealthDao.findByUsername(username);
	}


}
