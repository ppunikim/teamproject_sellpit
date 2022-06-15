package com.callor.school.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.callor.school.model.BreathVO;
import com.callor.school.model.GuidVO;
import com.callor.school.pesistance.BreathDao;
import com.callor.school.service.BreathService;

@Service
public class BreathServiceImpl implements BreathService{
	@Autowired
	private BreathDao breathDao;
	
	
	@Override
	public List<BreathVO> selectAll() {
		// TODO Auto-generated method stub
		return breathDao.selectAll();
	}

	@Override
	public BreathVO findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(BreathVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(BreathVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<BreathVO> getBreath(String listid) {
		// TODO Auto-generated method stub
		return breathDao.getBreath(listid);
	}
	
}
