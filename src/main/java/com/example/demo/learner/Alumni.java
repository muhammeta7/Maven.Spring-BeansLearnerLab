package com.example.demo.learner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;

@Component
public class Alumni {

    @Autowired
    @Qualifier("previousStudents")
    private Students students;

    @Autowired
    @Qualifier("instructors")
    private Instructors instructors;

    @PostConstruct
    public void executeBootcamp(){
        double numOfHours = 1200.0 * students.size();
        double numOfHoursPer = numOfHours / instructors.findAll().size();
        instructors.forEach(i -> i.lecture(students, numOfHoursPer));
    }

    public Students getStudents() {
        return students;
    }

    public void setStudents(Students students) {
        this.students = students;
    }

    public Instructors getInstructors() {
        return this.instructors;
    }

    public void setInstructors(Instructors instructors) {
        this.instructors = instructors;
    }
}
