package com.oraclejava;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.oraclejava.drawing.model.*;
import com.oraclejava.drawing.service.ShapeService;

public class AopMain {
	public static void main(String[] args) {
		AbstractApplicationContext ctx =
				new ClassPathXmlApplicationContext("AopConfig.xml");
		
		//Triangle triangle = (Triangle)ctx.getBean("tri");//AopConfig.xml�� name�� tri �߰��� �ȴ�
//		Triangle triangle = (Triangle)ctx.getBean("triangle");
//		System.out.println("�̸�: "+ triangle.getName());
//		
//		Circle circle = (Circle)ctx.getBean("circle");
//		System.out.println("�̸�: " + circle.getName());
//		aop:  �ٸ� Ŭ������ �̸��� ����  ��� �ִ� �ϳ��� Ŭ���� �̸��� �˾Ƶ� ctrl space�� �ҷ����� �ִ�
//		
		
		ShapeService ss = (ShapeService)ctx.getBean("shapeService");
		Circle circle = ss.getCircle();
		Triangle tri = ss.getTriangle();
		
		System.out.println("�̸�: " + circle.getName());
		System.out.println("�̸�: "+ tri.getName());
		
		ctx.close();
	}
}














