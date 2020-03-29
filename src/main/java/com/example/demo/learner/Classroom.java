package com.example.demo.learner;

import com.example.demo.configs.ClassroomConfig;

public class Classroom {

    private Students students;
    private Instructors instructors;

    public Classroom(Students students, Instructors instructors) {
        this.students = students;
        this.instructors = instructors;
    }

    public void hostLecture(Teacher teacher, double numberOfHours) {
        teacher.lecture(students, numberOfHours);
    }

    public Students getStudents() {
        return students;
    }

    public void setStudents(Students students) {
        this.students = students;
    }

    public Instructors getInstructors() {
        return instructors;
    }

    public void setInstructors(Instructors instructors) {
        this.instructors = instructors;
    }

    @Override
    public String toString() {
        return "Classroom: \n" +
                "students:\n" + students +
                "instructors:\n" + instructors;
    }

}
