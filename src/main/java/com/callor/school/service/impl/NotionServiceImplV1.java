package com.callor.school.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.callor.school.model.NotionVO;
import com.callor.school.service.NotionService;

@Service
public class NotionServiceImplV1 implements NotionService{

	private final NotionService notionService;
	public NotionServiceImplV1(NotionService notionService) {
		this.notionService = notionService;
	}
	
	@Override
	public void create_notion_table() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<NotionVO> selectAll() {
		List<NotionVO> noList = notionService.selectAll();
		return noList;
	}

	@Override
	public NotionVO findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(NotionVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(NotionVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

}
