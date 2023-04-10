package com.oraclejava;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.oraclejava.*;
import com.oraclejava.drawing.model.*;
import com.oraclejava.drawing.service.TaxService;
public class TaxMain {

	public static void main(String[] args) {
		
		AbstractApplicationContext ctx =
				new ClassPathXmlApplicationContext("TaxConfig.xml");
						
		
		TaxService t = (TaxService)ctx.getBean("taxService");
		Tax tax = t.getTax();
		
		
		System.out.println("¼¼±Ý: " + tax.getTax() + "¿ø");
		
		
		
		ctx.close();
	}
}
