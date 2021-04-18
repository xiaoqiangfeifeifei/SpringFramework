package com.gary;

import com.gary.controller.WelComeController;
import com.gary.entity.Factory.UserFactoryBean;
import com.gary.entity.User;
import com.gary.service.Welcome;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @ClassName: Entrance
 * @Author garylovekira
 * @Date 2021/1/1
 * @Version 1.0
 */
@Configuration
@ComponentScan("com.gary")
public class Entrance {
//	public static void main(String[] args) {
//		String sourcePath = "E:\\learnProject\\spring-framework-5.2.0.RELEASE\\springdemo\\src\\main\\resources\\config\\spring-config.xml";
//		ApplicationContext applicationContext = new FileSystemXmlApplicationContext(sourcePath);
////		Welcome welcome = (Welcome) applicationContext.getBean("welCome");
////
////		welcome.say("test");
//
//		User user = (User)applicationContext.getBean("userfactoryBean");
//		System.out.println(user);
//		UserFactoryBean userFactoryBean = (UserFactoryBean) applicationContext.getBean("&userfactoryBean");
//		System.out.println(userFactoryBean);
//
//	}

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Entrance.class);

		String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();

		for (String beanName: beanDefinitionNames) {
			System.out.println(beanName);
		}

		WelComeController welComeController = (WelComeController)applicationContext.getBean("welComeController");
		welComeController.handleRequest();
		User user = (User)applicationContext.getBean("user5");
		System.out.println(user);

	}
}
