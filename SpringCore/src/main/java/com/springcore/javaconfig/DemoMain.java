package com.springcore.javaconfig;

import org.springframework.context.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext context = new  AnnotationConfigApplicationContext(JavaConfig.class);
Student student=context.getBean("firststudent",Student.class);
System.out.println(student);
student.study();

System.out.println("___________________________");

Teacher teacher=context.getBean("getTeacher",Teacher.class);
System.out.println(teacher);
teacher.teacherMethod();
	
	}

}
  