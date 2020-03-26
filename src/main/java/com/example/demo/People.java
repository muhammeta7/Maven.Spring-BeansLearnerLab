package com.example.demo;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public abstract class People <PersonType extends Person> implements Iterable<PersonType>{

    protected List<PersonType> personList;

    public People(List<PersonType> personList){
        this.personList = personList;
    }

    public People(PersonType ... people){
        this.personList = Arrays.asList(people);
    }

    public void add(PersonType personType){
        personList.add(personType);
    }

    public void remove(PersonType personType){
        personList.remove(personType);
    }

    public int size(){
        return personList.size();
    }

    public void clear(){
        personList.clear();
    }

    public void addAll(Iterable<PersonType> personTypeIterable){
        personTypeIterable.forEach(personList::add);
    }

    public PersonType findById(long id){
        for(PersonType p : personList){
            if(p.getId().equals(id)){
                return p;
            }
        }
        return null;
    }

    public List<PersonType> findAll(){
        return personList;
    }

    public Iterator<PersonType> iterator(){
        return personList.iterator();
    }

    public String toString(){
        String toString = "";
        for(PersonType p : personList){
            toString += "ID: " + p.getId() + "  Name: " + p.getName() + "\n";
        }
        return toString;
    }
}
