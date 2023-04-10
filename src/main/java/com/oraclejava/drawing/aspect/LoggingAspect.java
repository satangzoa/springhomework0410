package com.oraclejava.drawing.aspect;

import java.beans.BeanProperty;

import org.aspectj.lang.annotation.*;

@Aspect
public class LoggingAspect {
	//getName�� ���ा�� ���� �ش� �żҵ带 �����Ų��
	@Before("execution(public String getName())")
	public void loggingAdvice() {
//		System.out.println("logging Advice is running2");
	}
	
	@After("execution(public String getName())")
	public void loggingAdvice2() {
//		System.out.println("logging Advice is running3");
	}

	@AfterReturning(pointcut = "execution(public String getName())", returning = "name")
	public void loggingAdvice3(String name) {
		System.out.println("���ϰ�: " + name + " ���ְԵ弼��");
	}
}
