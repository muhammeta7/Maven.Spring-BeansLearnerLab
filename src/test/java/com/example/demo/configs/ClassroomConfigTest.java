package com.example.demo.configs;

import com.example.demo.learner.Classroom;
import com.example.demo.learner.Instructors;
import com.example.demo.learner.Students;
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
public class ClassroomConfigTest {

    @Autowired
    @Qualifier("students")
    private Students currentStudents;

    @Autowired
    @Qualifier("previousStudents")
    private Students previousStudents;

    @Autowired
    @Qualifier("tcUsaInstructors")
    private Instructors tcUsaInstructors;

    @Autowired
    @Qualifier("instructors")
    private Instructors zipCodeInstructors;

    @Autowired
    ClassroomConfig config;

    @Test
    public void currentCohortTest(){
        // Given
        String expected = "Classroom: \n" +
                "students:\n" +
                "ID: 0  Name: CS0\n" +
                "ID: 1  Name: CS1\n" +
                "ID: 2  Name: CS2\n" +
                "ID: 3  Name: CS3\n" +
                "ID: 4  Name: CS4\n" +
                "instructors:\n" +
                "ID: 0  Name: Kris\n" +
                "ID: 1  Name: Chris\n" +
                "ID: 2  Name: Dolio\n" +
                "ID: 3  Name: Froilan\n" +
                "ID: 4  Name: Roberto\n";

        // When
        String actual = config.currentCohort(currentStudents, zipCodeInstructors).toString();
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void previousCohortTest(){
        // Given
        String expected = "Classroom: \n" +
                "students:\n" +
                "ID: 0  Name: PrevS0\n" +
                "ID: 1  Name: PrevS1\n" +
                "ID: 2  Name: PrevS2\n" +
                "ID: 3  Name: PrevS3\n" +
                "ID: 4  Name: PrevS4\n" +
                "instructors:\n" +
                "ID: 0  Name: TcUsaInstructor0\n" +
                "ID: 1  Name: TcUsaInstructor1\n" +
                "ID: 2  Name: TcUsaInstructor2\n" +
                "ID: 3  Name: TcUsaInstructor3\n" +
                "ID: 4  Name: TcUsaInstructor4\n";

        // When
        String actual = config.previousCohort(previousStudents, tcUsaInstructors).toString();
        // Then
        Assert.assertEquals(expected, actual);
    }


}
