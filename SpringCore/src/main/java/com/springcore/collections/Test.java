package com.springcore.collections;

import org.springframework.context.support.*;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/collections/collectionconfig.xml");
		
		Emp emp1 = (Emp) context.getBean("emp1");
		
		System.out.println(emp1);
		context.close();
	}

}
