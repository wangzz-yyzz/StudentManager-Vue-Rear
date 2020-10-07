package com.app.control;

import com.app.pojo.Student;
import com.app.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.security.PermitAll;
import java.util.List;

@CrossOrigin("http://localhost:5050")
@RestController
@RequestMapping("/student")
public class StudentController {


    private final StudentService studentService;
    @Autowired
    public StudentController(StudentService studentService){
        this.studentService=studentService;
    }

    @RequestMapping("/selStudentAll")
    public List<Student> findStudentAll(){
        return studentService.findStudentAll();
    }

    @RequestMapping("/update")
    public String upDate(Student student){
        studentService.updateStudent(student);
        return "ok";
    }

    @RequestMapping("/delete")
    public String Del(int id){
        studentService.delStudent(id);
        return "ok";
    }

    @RequestMapping("/add")
    public String Add(Student student){
        studentService.addStudent(student);
        return "ok";
    }
}
