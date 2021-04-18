package com.gary.entity.Factory;

import com.gary.entity.User;

/**
 * @ClassName: StaticFactory
 * @Author garylovekira
 * @Date 2021/1/18
 * @Version 1.0
 */
public class StaticFactory {

	public static User getUser(){
		return new User();
	}
}
