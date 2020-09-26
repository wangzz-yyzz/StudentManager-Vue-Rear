package com.app;

import com.app.pojo.Student;
import com.app.service.StudentService;
import com.app.service.impl.StudentServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Random;

@SpringBootTest
class AppApplicationTests {

    @Test
    void contextLoads() {
        StudentServiceImpl studentService=new StudentServiceImpl();
        Student student=new Student();
        for (int i = 0; i < 20; i++) {
            Random random=new Random();
            

        }

    }

}
