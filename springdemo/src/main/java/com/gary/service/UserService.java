package com.gary.service;

import com.gary.entity.User;

public interface UserService {
	User createUser(String firstName, String lastName, int age);

	User queryUser();

}
