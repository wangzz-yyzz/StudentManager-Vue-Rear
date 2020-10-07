package com.app.service.impl;

import com.app.mapper.StudentMapper;
import com.app.pojo.Student;
import com.app.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {

    private final StudentMapper studentMapper;
    @Autowired(required = false)
    public StudentServiceImpl(StudentMapper studentMapper){
        this.studentMapper = studentMapper;
    }

    @Override
    public void addStudent(Student student) {
        studentMapper.insertStudent(student);
    }

    @Override
    public void delStudent(int id) {
        studentMapper.delStudent(id);
    }

    @Override
    public void updateStudent(Student student) {
        studentMapper.updateStudent(student);
    }

    @Override
    public List<Student> findStudentAll() {
        return studentMapper.selStudent();
    }
}
