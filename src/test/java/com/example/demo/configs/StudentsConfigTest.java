package com.example.demo.configs;

import com.example.demo.learner.Instructors;
import com.example.demo.learner.Student;
import com.example.demo.learner.Students;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentsConfigTest {

    @Autowired
    @Qualifier("students")
    private Students currentStudents;

    @Autowired
    @Qualifier("previousStudents")
    private Students previousStudents;

    @Autowired
    private StudentsConfig config;

    @Test
    public void testCurrentStudents(){
        // Given
        StringBuilder sb = new StringBuilder();
        for(Student s : currentStudents){
            sb.append("ID: " + s.getId() + "  Name: " + s.getName() + "\n") ;
        }
        String expected = sb.toString();
        // When
        String actual = config.currentStudents().toString();
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testPreviousStudents(){
        // Given
        StringBuilder sb = new StringBuilder();
        for(Student s : previousStudents){
            sb.append("ID: " + s.getId() + "  Name: " + s.getName() + "\n") ;
        }
        String expected = sb.toString();
        // When
        String actual = config.previousStudents().toString();
        // Then
        Assert.assertEquals(expected, actual);
    }

}
