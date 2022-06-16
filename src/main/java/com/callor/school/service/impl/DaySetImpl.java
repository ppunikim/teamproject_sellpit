package com.callor.school.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.callor.school.model.DaySetVO;
import com.callor.school.pesistance.DaySetDao;
import com.callor.school.service.DaySetService;

@Service
public class DaySetImpl implements DaySetService {

	@Autowired
	private DaySetDao daysetDao;

	@Override
	public List<DaySetVO> findByUsername(String username) {
		return daysetDao.findByUsername(username);
	}

	@Override
	public List<DaySetVO> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DaySetVO findById(String id) {
		DaySetVO daysetVO = daysetDao.findById(id);

		return daysetVO;
	}

	@Override
	public int insert(DaySetVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(DaySetVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

}
