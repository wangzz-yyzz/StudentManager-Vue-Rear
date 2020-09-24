package com.app.mapper;

import com.app.pojo.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudentMapper {
    void insertStudent(Student student);
    void delStudent(int id);
    void updateStudent(Student student);
    List<Student> selStudent();
}
