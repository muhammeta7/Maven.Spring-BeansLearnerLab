package com.example.demo.learner;
import org.apache.commons.collections4.IterableUtils;

import java.util.ArrayList;

public class Instructor extends Person implements Teacher {

    private double numberOfHoursTaught;

    public Instructor(Integer id, String name) {
        super(id, name);
        numberOfHoursTaught = 0;
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
        numberOfHoursTaught += numberOfHours;
    }

    @Override
    public void lecture(Iterable<? extends Learner> learners, double numOfHours) {
        Double hrsPer = numOfHours/((ArrayList<Learner>) learners).size();
        learners.forEach(l -> l.learn(hrsPer));
        numberOfHoursTaught += numOfHours;
    }

    public double getNumberOfHoursTaught() {
        return numberOfHoursTaught;
    }
}
