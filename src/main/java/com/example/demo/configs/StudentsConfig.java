package com.example.demo.configs;

import com.example.demo.learner.Student;
import com.example.demo.learner.Students;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Configuration
public class StudentsConfig {

    @Bean(name = "students")
    public Students currentStudents(){
        ArrayList<Student> current = new ArrayList<>(5);
        for(int i = 0; i < 6; i++) {
            current.add(new Student(i,"CS"+i));
        }
        return new Students(current);
    }

    @Bean(name = "previousStudents")
    public Students previousStudents() {
        ArrayList<Student> previous = new ArrayList<>(5);
        for(int i = 0; i < 6; i++) {
            previous.add(new Student(i,"PrevS"+i));
        }
        return new Students(previous);
    }

}
