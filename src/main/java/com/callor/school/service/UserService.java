package com.callor.school.service;

import com.callor.school.model.UserVO;
import com.callor.school.pesistance.GenericDao;
import com.callor.school.pesistance.UserDao;

public interface UserService extends UserDao{
	public UserVO login(UserVO userVO);
	public UserVO join(UserVO userVO);
}
