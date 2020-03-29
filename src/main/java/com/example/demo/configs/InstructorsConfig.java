package com.example.demo.configs;

import com.example.demo.learner.Instructor;
import com.example.demo.learner.Instructors;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class InstructorsConfig {

    @Bean(name = "tcUsaInstructors")
    public Instructors tcUsaInstructors() {
        Instructor[] instArr = new Instructor[5];
        for (int i = 0; i < instArr.length; i++) {
            instArr[i] = new Instructor(i, "TcUsaInstructor" + i);
        }
        return new Instructors(instArr);
    }

    @Qualifier
    @Bean(name = "tcUKInstructors")
    public Instructors tcUkInstructors() {
        Instructor[] instArr = new Instructor[5];
        for (int i = 0; i < instArr.length; i++) {
            instArr[i] = new Instructor(i, "TcUkInstructor" + i);
        }
        return new Instructors(instArr);
    }

    @Bean(name = "instructors")
    @Primary
    public Instructors zipCodeInstructors() {
        Instructor[] array = new Instructor[5];
        String[] instNames = {"Kris", "Chris", "Dolio", "Froilan", "Roberto"};
        for (int i = 0; i < array.length; i++) {
            array[i] = new Instructor(i, instNames[i]);
        }
        return new Instructors(array);
    }

}
