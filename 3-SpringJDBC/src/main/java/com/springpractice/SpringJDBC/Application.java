package com.springpractice.SpringJDBC;

import com.springpractice.SpringJDBC.model.Student;
import com.springpractice.SpringJDBC.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Application.class, args);

		Student s = context.getBean(Student.class);

		s.setRollNo(104);
		s.setName("Harsha");
		s.setMarks(80);

		StudentService service = context.getBean(StudentService.class);
		service.addStudent(s);

		List<Student> students = service.getStudents();
		System.out.println(students);
	}

}
