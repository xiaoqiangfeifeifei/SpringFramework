package com.gary.service.impl;

import com.gary.entity.User;
import com.gary.service.UserService;

/**
 * @author liqiang
 * @date 2021/09/01 16:44
 **/
public class UserServiceImpl implements UserService {
	@Override
	public User createUser(String firstName, String lastName, int age) {
		User user = new User();
		user.setFirstName(firstName);
		user.setLastName(lastName);
		user.setAge(age);
		return user;
	}

	@Override
	public User queryUser() {
		User user = new User();
		user.setFirstName("test");
		user.setLastName("test");
		user.setAge(20);
		return user;
	}

}
