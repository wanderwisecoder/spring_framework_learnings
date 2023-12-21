package com.springcore.javaconfig;

import org.springframework.stereotype.Component;

//<!-- using @Component("firststudent") annotation to create bean class and to give bean id name -->
@Component("firststudent")
public class Student {
	
	

public void study() {
	System.out.println("You are in Student Class...");
}
}
