package com.wh.oauth2.serivce;

import com.wh.oauth2.model.UserEntity;

public interface UserService {
	/**
	 * 通过id得到user
	 * @param id
	 * @return
	 */
	public UserEntity getUserById(int id);
}
