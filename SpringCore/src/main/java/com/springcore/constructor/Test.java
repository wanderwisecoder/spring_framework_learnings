package com.springcore.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		
@SuppressWarnings("resource")
ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/constructor/constructorconfig.xml");

	Person person = (Person) context.getBean("person");
	System.out.println(person);
	
	
	Addition add1 = (Addition) context.getBean("add1");
	System.out.println(add1);
	add1.doSum();
	
	Addition add2 = (Addition) context.getBean("add2");
	System.out.println(add2);
	add1.doSum();
	

	}

}
