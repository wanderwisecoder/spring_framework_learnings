package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.springcore.javaconfig")
public class JavaConfig {
	
	@Bean
	public Samosa getSamosa()
	{
		return new Samosa();
	}
	
	@Bean(name = {"teacher","teacher1","teacher2"})
	public Teacher getTeacher() {
		
//Using @Bean annotation & java method, to create bean class and to give bean id name. In this case Method name is same as bean id name. -->
		//creating a new object.
		Teacher teacher = new Teacher(getSamosa());
		
		return teacher;
	
	}

}
