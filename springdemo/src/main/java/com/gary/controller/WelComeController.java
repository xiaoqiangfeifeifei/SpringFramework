package com.gary.controller;

import com.gary.service.Welcome;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @ClassName: WelComeServiceController
 * @Author garylovekira
 * @Date 2021/1/18
 * @Version 1.0
 */
@Controller
public class WelComeController {
	@Autowired
	private Welcome welcome;

	public void handleRequest() {
		welcome.say("controller test");
	}
}
