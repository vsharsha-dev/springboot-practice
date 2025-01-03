package com.springpractice.SpringDataJpaEx;

import com.springpractice.SpringDataJpaEx.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import javax.swing.text.html.Option;
import java.util.Optional;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(Application.class, args);

		StudentRepo repo = context.getBean(StudentRepo.class);

		Student s1 = context.getBean(Student.class);
		Student s2 = context.getBean(Student.class);
		Student s3 = context.getBean(Student.class);

//		s1.setRollNo(1);
//		s1.setName("Sai");
//		s1.setMarks(50);
//
//		s2.setRollNo(2);
//		s2.setName("Harsha");
//		s2.setMarks(70);
//
//		s3.setRollNo(3);
//		s3.setName("Kiran");
//		s3.setMarks(90);
//
//		repo.save(s2);
//		repo.save(s3);

//		Optional<Student> s = repo.findById(100); // findById returns "Optional" object which can be null
//
//		System.out.println(s.orElse(new Student())); // If s is null, it prints new Student object

		System.out.println(repo.findByName("Harsha"));
	}

}
