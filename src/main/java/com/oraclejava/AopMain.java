package com.oraclejava;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.oraclejava.drawing.model.*;
import com.oraclejava.drawing.service.ShapeService;

public class AopMain {
	public static void main(String[] args) {
		AbstractApplicationContext ctx =
				new ClassPathXmlApplicationContext("AopConfig.xml");
		
		//Triangle triangle = (Triangle)ctx.getBean("tri");//AopConfig.xml에 name은 tri 추가가 된다
//		Triangle triangle = (Triangle)ctx.getBean("triangle");
//		System.out.println("이름: "+ triangle.getName());
//		
//		Circle circle = (Circle)ctx.getBean("circle");
//		System.out.println("이름: " + circle.getName());
//		aop:  다른 클래스의 이름을 몰라도  담고 있는 하나의 클래스 이름만 알아도 ctrl space로 불러낼수 있다
//		
		
		ShapeService ss = (ShapeService)ctx.getBean("shapeService");
		Circle circle = ss.getCircle();
		Triangle tri = ss.getTriangle();
		
		System.out.println("이름: " + circle.getName());
		System.out.println("이름: "+ tri.getName());
		
		ctx.close();
	}
}














