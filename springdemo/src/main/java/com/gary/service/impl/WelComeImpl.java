package com.gary.service.impl;

import com.gary.service.Welcome;
import org.springframework.stereotype.Service;

/**
 * @ClassName: WelComeImpl
 * @Author garylovekira
 * @Date 2021/1/1
 * @Version 1.0
 */
@Service
public class WelComeImpl implements Welcome {
	@Override
	public String say(String sayStr) {
		System.out.println("你好！！！"+ sayStr);
		return "ssss";
	}
}
