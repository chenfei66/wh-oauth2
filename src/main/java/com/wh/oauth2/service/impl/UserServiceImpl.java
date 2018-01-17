package com.wh.oauth2.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wh.oauth2.dao.UserDao;
import com.wh.oauth2.model.UserEntity;
import com.wh.oauth2.serivce.UserService;

@Service(value = "userServiceImpl")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	@Override
	public UserEntity getUserById(int id) {
		return userDao.getUserById(id);
	}}
