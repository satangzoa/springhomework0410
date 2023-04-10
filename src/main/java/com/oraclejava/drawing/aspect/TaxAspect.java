package com.oraclejava.drawing.aspect;

import java.beans.BeanProperty;

import org.aspectj.lang.annotation.*;

@Aspect
public class TaxAspect {
	
//	@Before("execution(public String getTax()))")
//	public void loggingAdvice() {
//		System.out.println("");
//	}
//	
//
//	@After("execution(public String getTax()))")
//	public void loggingAdvice2() {
//		System.out.println("");
//	}
	
	
	@AfterReturning(pointcut = "execution(public String getTax())", returning = "tax")
	public void loggingAdvice3(String tax) {
		System.out.println("세금포함 금액: " + Integer.parseInt(tax)*10 + " 원입니다.");
	}
	
	
}
