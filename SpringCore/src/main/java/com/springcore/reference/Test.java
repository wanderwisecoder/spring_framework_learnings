package com.springcore.reference;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/reference/referenceconfig.xml");
		
		A tempt  =  (A) context.getBean("aref");
		A tempt1 =  (A) context.getBean("aref1");
		A tempt2 =  (A) context.getBean("aref2");
		A tempt3 =  (A) context.getBean("aref3");
		
		System.out.println(tempt);
		System.out.println(tempt.getX());
		System.out.println(tempt1);
		System.out.println(tempt2);
		System.out.println(tempt3);
		context.close();
	

	}

}
