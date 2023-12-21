package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/stereotype/stereotypeconfig.xml");

Student student1 = context.getBean("student1",Student.class);

System.out.println(student1);
System.out.println(student1.hashCode());

Student student2 = context.getBean("student1",Student.class);

System.out.println(student2);
System.out.println(student2.hashCode());

Teacher teacher1 = context.getBean("teacher1",Teacher.class);
System.out.println(teacher1);
System.out.println(teacher1.hashCode());


Teacher teacher2 = context.getBean("teacher1",Teacher.class);
System.out.println(teacher2);
System.out.println(teacher2.hashCode());

	}

}
