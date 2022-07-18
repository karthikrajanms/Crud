package com.karthik.in.service;

import com.karthik.in.entity.Student;

import java.util.List;

public interface StudentService {


    Student saveStudent(Student student);

    Student getStudentById();

    List<Student> getAllStudent();
}
