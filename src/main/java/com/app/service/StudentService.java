package com.app.service;

import com.app.pojo.Student;

import java.util.List;

public interface StudentService {
    void addStudent(Student student);
    void delStudent(int id);
    void updateStudent(Student student);
    List<Student> findStudentAll();
}
