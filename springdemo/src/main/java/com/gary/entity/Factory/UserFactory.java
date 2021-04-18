package com.gary.entity.Factory;

import com.gary.entity.User;

/**
 * @ClassName: UserFactory
 * @Author garylovekira
 * @Date 2021/1/18
 * @Version 1.0
 */
public class UserFactory {

	public User getUser() {
		return new User();
	}
}
