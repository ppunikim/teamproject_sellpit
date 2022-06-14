package com.callor.school.pesistance;

import com.callor.school.model.NotionVO;

public interface NotionDao extends GenericDao<NotionVO, String>{
	
	public void create_notion_table();

}
