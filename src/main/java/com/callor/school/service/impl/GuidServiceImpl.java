package com.callor.school.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.callor.school.model.GuidVO;
import com.callor.school.pesistance.GuidDao;
import com.callor.school.service.GuidService;

@Service
public class GuidServiceImpl implements GuidService{
	@Autowired
	private GuidDao guidDao;
	@Override
	public List<GuidVO> selectAll() {
		
		return guidDao.selectAll();
	}

	@Override
	public GuidVO findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(GuidVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(GuidVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public  List<GuidVO> getGuid(String listid) {
		return guidDao.getGuid(listid);
	}

}
