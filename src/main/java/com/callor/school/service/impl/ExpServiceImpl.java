package com.callor.school.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.callor.school.model.ExpVO;
import com.callor.school.model.GuidVO;
import com.callor.school.pesistance.ExpDao;
import com.callor.school.service.ExpService;

@Service
public class ExpServiceImpl implements ExpService{
	@Autowired
	private ExpDao expDao; 
	
	@Override
	public List<ExpVO> selectAll() {
		// TODO Auto-generated method stub
		return expDao.selectAll();
	}




	@Override
	public ExpVO findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(ExpVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(ExpVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(String id) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public  List<ExpVO> getExp(String explist) {
		return expDao.getExp(explist);
	}
	
}
