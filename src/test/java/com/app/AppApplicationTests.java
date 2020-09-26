package com.app;

import com.app.pojo.Student;
import com.app.service.StudentService;
import com.app.service.impl.StudentServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@SpringBootTest
class AppApplicationTests {

    @Test
    void contextLoads() {
        StudentServiceImpl studentService=new StudentServiceImpl();
        Student student=new Student();

        List<String> name=new ArrayList<>();
        name.add("张三");
        name.add("李四");
        name.add("王五");
        List<String> sex=new ArrayList<>();
        sex.add("男");
        sex.add("女");

        for (int i = 0; i < 50; i++) {
            Random random=new Random();

            student.setId(i+1);
            student.setName(name.get(random.nextInt(name.size())));
            student.setCollege("人工智能学院");
            student.setGrade("19级");
            student.setSex(sex.get(random.nextInt(sex.size())));
            student.setMajor("智科");

            studentService.addStudent(student);

        }

    }

}
