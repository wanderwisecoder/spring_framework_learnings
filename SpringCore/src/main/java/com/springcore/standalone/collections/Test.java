package com.springcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("resource")
		ApplicationContext context  = new ClassPathXmlApplicationContext("com/springcore/standalone/collections/standalonecollectionconfig.xml");
	Person person1 = context.getBean("person1",Person.class);
	Person person2 = context.getBean("person2",Person.class);
	System.out.println(person1);
	System.out.println(person1.getFeeStructure().getClass().getName());
	System.out.println(person1.getFriends().getClass().getName());
	System.out.println(person1.getProperties());
	System.out.println("___________________________________________");
	System.out.println(person2);
	System.out.println(person2.getFriends().getClass().getName());
	System.out.println("___________________________________________");
	
	
	}

}
