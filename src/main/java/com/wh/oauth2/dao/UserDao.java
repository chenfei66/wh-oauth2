package com.wh.oauth2.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.wh.oauth2.model.UserEntity;

@Mapper
public interface UserDao {

	/**
	 * 通过id得到user
	 * @param id
	 * @return
	 */
	UserEntity getUserById(@Param("id")int id);
	
	/**
	 * 通过登录名拿到用户信息
	 * @return
	 */
	public UserEntity getUserEntityByLoginName(@Param("loginName") String loginName);
	
}
