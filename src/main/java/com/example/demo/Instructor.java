package com.example.demo;
import org.apache.commons.collections4.IterableUtils;

public class Instructor extends Person implements Teacher {

    private double numberOfHoursTaught = 0;

    public Instructor(Long id, String name) {
        super(id, name);
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
    }

    @Override
    public void lecture(Iterable<? extends Learner> learners, double numberOfHours) {
        for(Learner learner : learners){
            teach(learner, numberOfHours / IterableUtils.size(learners) );
        }
        numberOfHoursTaught += numberOfHours;
    }

    public double getNumberOfHoursTaught() {
        return numberOfHoursTaught;
    }
}
