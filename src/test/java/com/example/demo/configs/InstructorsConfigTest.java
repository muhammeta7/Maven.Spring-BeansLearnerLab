package com.example.demo.configs;

import com.example.demo.learner.Instructor;
import com.example.demo.learner.Instructors;
import com.example.demo.learner.Student;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.logging.Level;
import java.util.logging.Logger;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InstructorsConfigTest {

    Logger logger = Logger.getLogger(this.getClass().getName());

    @Autowired
    @Qualifier("tcUsaInstructors")
    private Instructors tcUsaInstructors;

    @Autowired
    @Qualifier("tcUKInstructors")
    private Instructors tcUkInstructors;

    @Autowired
    @Qualifier("instructors")
    private Instructors zipCodeInstructors;

    @Test
    public void setTcUsaInstructorsTest(){
        // Given
        Integer expected = 5;
        // When
        Integer actual = tcUsaInstructors.size();
        // Then
        Assert.assertEquals(expected, actual);
        logger.log(Level.INFO, tcUsaInstructors.toString());
    }

    @Test
    public void setTcUKInstructorsTest(){
        // Given
        Integer expected = 5;
        // When
        Integer actual = tcUkInstructors.size();
        // Then
        Assert.assertEquals(expected, actual);
        logger.log(Level.INFO, tcUsaInstructors.toString());
    }

    @Test
    public void zipCodeInstructorsTest(){
        // Given
        Integer expected = 5;
        // When
        Integer actual = zipCodeInstructors.size();
        // Then
        Assert.assertEquals(expected, actual);
        logger.log(Level.INFO, zipCodeInstructors.toString());
    }

}
