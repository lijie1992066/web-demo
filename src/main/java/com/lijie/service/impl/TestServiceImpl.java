package com.lijie.service.impl;

import com.lijie.dao.mapper.YsUserMapper;
import com.lijie.domain.YsUser;
import com.lijie.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {
	
	@Autowired
	private YsUserMapper ysUserMapper;
	
	@Override
	public void addUser(YsUser user) {
		ysUserMapper.insert(user);
	}
	
}
