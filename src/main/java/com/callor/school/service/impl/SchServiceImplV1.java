package com.callor.school.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.callor.school.model.SchVO;
import com.callor.school.pesistance.SchDao;
import com.callor.school.service.SchService;

/*
 * UserServiceImplV1 클래스를 Component(bean) 로 등록하기
 */
@Service
public class SchServiceImplV1 implements SchService {

	private final SchDao schDao;
	public SchServiceImplV1(SchDao schDao) {
		this.schDao = schDao;
	}

	@Override
	public List<SchVO> selectAll() {
		List<SchVO> sch = schDao.selectAll();
		return sch;
	}
	@Override
	public SchVO findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int insert(SchVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int update(SchVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int delete(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<SchVO> idAll() {
		List<SchVO> sch = schDao.idAll();
		return sch;
	}

	


	

}
