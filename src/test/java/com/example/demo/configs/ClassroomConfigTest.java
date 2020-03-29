package com.example.demo.configs;

import com.example.demo.learner.Classroom;
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

    Logger logger = Logger.getLogger(this.getClass().getName());

    @Autowired
    @Qualifier("currentCohort")
    private Classroom current;

    @Autowired
    @Qualifier("previousCohort")
    private Classroom previous;

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
                "ID: 5  Name: CS5\n" +
                "ID: 6  Name: CS6\n" +
                "ID: 7  Name: CS7\n" +
                "ID: 8  Name: CS8\n" +
                "ID: 9  Name: CS9\n" +
                "ID: 10  Name: CS10\n" +
                "instructors:\n" +
                "ID: 0  Name: Kris\n" +
                "ID: 1  Name: Chris\n" +
                "ID: 2  Name: Dolio\n" +
                "ID: 3  Name: Froilan\n" +
                "ID: 4  Name: Roberto\n";

        // When
        String actual = current.toString();

        // Then
        logger.log(Level.INFO, current.toString());
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
                "ID: 5  Name: PrevS5\n" +
                "ID: 6  Name: PrevS6\n" +
                "ID: 7  Name: PrevS7\n" +
                "ID: 8  Name: PrevS8\n" +
                "ID: 9  Name: PrevS9\n" +
                "ID: 10  Name: PrevS10\n" +
                "instructors:\n" +
                "ID: 0  Name: TcUsaInstructor0\n" +
                "ID: 1  Name: TcUsaInstructor1\n" +
                "ID: 2  Name: TcUsaInstructor2\n" +
                "ID: 3  Name: TcUsaInstructor3\n" +
                "ID: 4  Name: TcUsaInstructor4\n";

        // When
        String actual = previous.toString();

        // Then
        logger.log(Level.INFO, previous.toString());
        Assert.assertEquals(expected, actual);
    }


}
