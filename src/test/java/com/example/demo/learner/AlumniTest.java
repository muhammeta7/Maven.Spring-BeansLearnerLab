package com.example.demo.learner;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.swing.*;
import java.util.Arrays;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AlumniTest {

    @Autowired
    private Alumni alumni;

    @Test
    public void executeBootcampTest(){
        // Given
        double[] expected = new double[alumni.getStudents().size()];
        double numOfHours = 1200.0;
        Arrays.fill(expected, numOfHours);

        // When
        double[] actual = new double[alumni.getStudents().size()];
        for (int i = 0; i < actual.length ; i++) {
            actual[i] = alumni.getStudents().findAll().get(i).getTotalStudyTime();
        }

        // Then
        for (int i = 0; i < expected.length; i++) {
            Assert.assertEquals(expected[i], actual[i], .001);
        }
    }

}
