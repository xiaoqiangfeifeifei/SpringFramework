package com.gary.service.aspect;

import java.lang.reflect.Method;
import java.util.Arrays;
import org.springframework.aop.MethodBeforeAdvice;

/**
 * @author liqiang
 * @date 2021/09/01 16:47
 **/
public class LogArgsAdvice implements MethodBeforeAdvice {
	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		System.out.println("准备执行方法: " + method.getName() + ", 参数列表：" + Arrays.toString(args));
	}
}
