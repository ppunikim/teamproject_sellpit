package com.callor.school.pesistance;

import java.util.List;


import org.apache.ibatis.annotations.Param;
import com.callor.school.model.DayHealthVO;
import com.callor.school.model.UserVO;

public interface DayHealthDao extends GenericDao<DayHealthVO, String> {

	public void create_mypage_dayhealth();

	public int insert(DayHealthVO dayHealthVO, UserVO userVO);


	public List<DayHealthVO> findByUsername(String username);
	public List<DayHealthVO> findByUsers(@Param("my_username") String my_username);
	public List<DayHealthVO> findByUsersDate(@Param("my_username") String my_username,@Param("my_date") String my_date);

}
