package com.example.demo.learner;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public abstract class People <PersonType extends Person> implements Iterable<PersonType>{

    List<PersonType> personList;

    public People(List<PersonType> personList) {
        this.personList = personList;
    }

    public void add(PersonType person) {
        personList.add(person);
    }

    public void remove(PersonType person) {
        personList.remove(person);
    }

    public int size() {
        return personList.size();
    }

    public void clear() {
        personList.clear();
    }

    public void addAll(Iterable<PersonType> iterable) {
        iterable.forEach(personList::add);
    }

    public PersonType findById(Integer id){
        for (PersonType p : personList) {
            if (p.getId() == id)
                return p;
        }
        return null;
    }

    public List<PersonType> findAll() {
        return personList;
    }

    public String toString(){
        String toString = "";
        for(PersonType p : personList){
            toString += "ID: " + p.getId() + "  Name: " + p.getName() + "\n";
        }
        return toString;
    }


}
