package com.wh.oauth2.controller;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.wh.oauth2.model.UserEntity;
import com.wh.oauth2.serivce.UserService;

@RestController
public class UserController {

	private Logger log = LoggerFactory.getLogger(UserController.class);

	@Resource(name = "userServiceImpl")
	private UserService userService;

	@GetMapping("/users/user/{id}")
	public UserEntity userGet(@PathVariable int id) {
		UserEntity userEntity = userService.getUserById(id);
		log.debug("The method is ending");
		return userEntity;
	}
}
