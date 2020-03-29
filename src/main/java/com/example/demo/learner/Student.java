package com.example.demo.learner;

public class Student extends Person implements Learner{

    private Double totalStudyTime;

    public Student(Integer id, String name) {
        super(id, name);
        totalStudyTime = 0.0;
    }

    public Double getTotalStudyTime() {
        return totalStudyTime;
    }

    @Override
    public void learn(Double numOfHrs) {
        totalStudyTime += numOfHrs;
    }
}
