package com.example.test.crud.democrud;

import com.example.test.crud.democrud.dao.StudentRepository;
import com.example.test.crud.democrud.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemocrudApplication{

	public static void main(String[] args) {
		SpringApplication.run(DemocrudApplication.class, args);

	}

//	@Autowired
//	private StudentRepository studentRepository;
//
//	@Override
//	public void run(String... args) throws Exception {
//		studentRepository.save(new Student("James","Johnson","james@gmail.com"));
//		studentRepository.save(new Student("Riche","Jone","riche@gmail.com"));
//	}
}
