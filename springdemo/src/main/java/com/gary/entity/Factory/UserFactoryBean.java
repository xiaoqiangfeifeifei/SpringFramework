package com.gary.entity.Factory;

import com.gary.entity.User;
import org.springframework.beans.factory.FactoryBean;

/**
 * @ClassName: UserFactory
 * @Author garylovekira
 * @Date 2021/1/18
 * @Version 1.0
 */
public class UserFactoryBean  implements FactoryBean<User> {

	@Override
	public User getObject() throws Exception {
		 return new User();
	}

	@Override
	public Class<?> getObjectType() {
		return User.class;
	}
}
