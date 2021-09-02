package com.gary.service.aspect;

import java.lang.reflect.Method;
import org.springframework.aop.AfterReturningAdvice;

/**
 * @author liqiang
 * @date 2021/09/01 16:47
 **/
public class LogResultAdvice implements AfterReturningAdvice {
	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target)
			throws Throwable {
		System.out.println(method.getName() + "方法返回：" + returnValue);
	}
}
