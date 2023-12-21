package com.spring.jdbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.spring.jdbc.entites.Student;

@Component(value= "studentDao")
public class StudentDaoImpl implements StudentDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int insert(Student student) {

		// Insert query
		String query = "insert into student(id,name,city) value(?,?,?)";

		// fire query
		int result = this.jdbcTemplate.update(query, student.getId(), student.getName(), student.getCity());
		System.out.println("Number of records inserted " + result);

		return result;
	}

	@Override
	public int update(Student student) {

		// Update query
		String query = "update student set name=?, city=? where id=?";

		// fire query
		int result = this.jdbcTemplate.update(query, student.getName(), student.getCity(), student.getId());
		System.out.println("Number of updated records " + result);

		return result;
	}

	@Override
	public int delete(int studentId) {

		// Delete query
		String query = "delete from student  where id=?";

		// fire query
		int result = this.jdbcTemplate.update(query, studentId);
		System.out.println("Record deleted successfully " + result);

		return result;
	}

	@Override
	public Student getStudent(int studentid) {
		// Select query to select single student data
		String query = "select * from student where id=?";

		RowMapper<Student> rowMapper = new RowMapperImpl();

		// fire query
		Student student = this.jdbcTemplate.queryForObject(query, rowMapper, studentid);
		System.out.println("Number of records inserted ");

		return student;
	}

	@Override
	public List<Student> getAllStudents() {
		// selecting multiple students
		String query = "select * from student";

		List<Student> students = this.jdbcTemplate.query(query, new RowMapperImpl());

		return students;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
@Autowired
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}
