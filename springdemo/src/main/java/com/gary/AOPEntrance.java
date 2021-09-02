package com.gary;

import com.gary.service.OrderService;
import com.gary.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * aop
 *
 * @author liqiang
 * @date 2021/09/01 16:28
 **/
public class AOPEntrance {

	/**
	 * 源码入口
	 * @see org.springframework.aop.framework.autoproxy.AbstractAutoProxyCreator#postProcessAfterInitialization(java.lang.Object, java.lang.String)
	 * @param args
	 */
	public static void main(String[] args) {
		// 启动 Spring 的 IOC 容器
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:config/spring-aop-config.xml");

		UserService userService = context.getBean(UserService.class);
		OrderService orderService = context.getBean(OrderService.class);

		userService.createUser("Tom", "Cruise", 55);
		userService.queryUser();

		orderService.createOrder("Leo", "随便买点什么");
		orderService.queryOrder("Leo");
	}
}
