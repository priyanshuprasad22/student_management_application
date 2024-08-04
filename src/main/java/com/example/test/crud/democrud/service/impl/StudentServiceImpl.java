package com.example.test.crud.democrud.service.impl;

import com.example.test.crud.democrud.dao.StudentRepository;
import com.example.test.crud.democrud.entity.Student;
import com.example.test.crud.democrud.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;


    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudents() {
        List<Student> studentList =  studentRepository.findAll();
        return studentList;
    }

    @Override
    public Student saveStudent(Student student){

        return studentRepository.save(student);

    }

    @Override
    public Student getStudentById(Long id) {
         Student student=studentRepository.findById(id).get();
         return student;
    }

    @Override
    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public void deleteStudentById(Long id) {
        studentRepository.deleteById(id);
    }


}
