package com.oraclejava;

import org.springframework.context.support.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonMain {
	public static void main(String[] args) {
//		Person person = new Person();
//		person.setName("허재");
//		person.setAge(57);
//		person.setBirthPlace("춘천");
		
		AbstractApplicationContext ctx =
				new ClassPathXmlApplicationContext("SpringConfig.xml");
		
		
		Person person = (Person)ctx.getBean("person");
		System.out.println("이름:" + person.getName());
		System.out.println("나이:" + person.getAge());
		System.out.println("출생지:" + person.getBirthPlace());
		
		ctx.close();
	}
}
