package com.example.demo.configs;

import com.example.demo.BeansLearnerLabApplication;
import com.example.demo.learner.Classroom;
import com.example.demo.learner.Instructors;
import com.example.demo.learner.People;
import com.example.demo.learner.Students;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Primary;

@Configuration
public class ClassroomConfig {

    @Bean(name = "currentCohort")
    @DependsOn({"instructors", "students"})
    public Classroom currentCohort(@Qualifier("students") Students students, Instructors instructors){
        return new Classroom(students, instructors);
    }

    @Bean(name = "previousCohort")
    @DependsOn({"tcUsaInstructors", "previousStudents"})
    public Classroom previousCohort(@Qualifier("previousStudents") Students students, @Qualifier("tcUsaInstructors") Instructors instructors){
        return new Classroom(students, instructors);
    }

}
