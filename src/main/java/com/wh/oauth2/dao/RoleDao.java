package com.wh.oauth2.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RoleDao {

	/**
	 * 通过UserId得到对应的role
	 * 
	 * @param id
	 * @return
	 */
	public List<String> getRolesByUserId(int id);
}
