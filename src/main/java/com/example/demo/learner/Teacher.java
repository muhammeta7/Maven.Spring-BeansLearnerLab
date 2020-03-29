package com.example.demo.learner;

import com.example.demo.learner.Learner;

public interface Teacher {

    void teach(Learner learner, double numberOfHours);
    void lecture(Iterable<? extends Learner> learners, double numberOfHours);

}
