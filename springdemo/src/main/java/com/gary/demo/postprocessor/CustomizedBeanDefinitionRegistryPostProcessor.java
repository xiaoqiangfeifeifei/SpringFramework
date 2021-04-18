package com.gary.demo.postprocessor;

import com.gary.entity.User;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName: CustomizedBeanDefinitionRegistryPostProcessor
 * @Author garylovekira
 * @Date 2021/1/26
 * @Version 1.0
 */
@Configuration
public class CustomizedBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor {
	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
		Class<User> userClass = User.class;

		BeanDefinitionBuilder beanDefinitionBuilder = BeanDefinitionBuilder.genericBeanDefinition(userClass);
		GenericBeanDefinition genericBeanDefinition =(GenericBeanDefinition) beanDefinitionBuilder.getRawBeanDefinition();

		registry.registerBeanDefinition("user5", genericBeanDefinition);
	}

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

	}
}
