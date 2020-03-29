package com.example.demo.learner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Instructors extends People<Instructor> {

    public Instructors(Instructor... instructors){
        super(new ArrayList<>(Arrays.asList(instructors)));
    }

    @Override
    public Iterator<Instructor> iterator() {
        return personList.iterator();
    }

}
