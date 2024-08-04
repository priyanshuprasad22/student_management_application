package com.example.test.crud.democrud.dao;


import com.example.test.crud.democrud.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {

}
