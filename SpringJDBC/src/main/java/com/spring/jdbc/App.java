package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.mysql.cj.x.protobuf.MysqlxCrud.Insert;
import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entites.Student;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Program started...");
		// spring jdbc => JdbcTemplate
		//ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
		ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
		// INSERT
//		JdbcTemplate template = context.getBean("jdbcTemplate", JdbcTemplate.class);
		//
//		// Insert query
//		String query = "insert into student(id,name,city) value(?,?,?)";
//
//		//fire query
//		int  result = template.update(query,123,"Ramesh","Delhi");
//		System.out.println("Number of records inserted "+ result);
//		
		StudentDao studentDao = context.getBean("studentDao", StudentDao.class);

		// Student student = new Student(333,"David","Bhopal");

		// INSERT
		// int result = studentDao.insert(student);

		// UPDATE
		// int result = studentDao.update(student);

		// DELETE
		// int result = studentDao.delete(222);

		// SELECT row from db
		Student student = studentDao.getStudent(333);
		System.out.println(student);
		
		System.out.println(studentDao.getAllStudents());
		
		List<Student> students  = studentDao.getAllStudents();
		for(Student s:students)
		{
			System.out.println(s);
		}
	}
}
