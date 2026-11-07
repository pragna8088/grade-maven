
package com.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class GradeTest {

    @Test
    public void testGradeA() {
        assertEquals("A", Grade.calculateGrade(95));
    }

    @Test
    public void testGradeB() {
        assertEquals("B", Grade.calculateGrade(85));
    }

    @Test
    public void testGradeC() {
        assertEquals("C", Grade.calculateGrade(75));
    }

    @Test
    public void testGradeF() {
        assertEquals("F", Grade.calculateGrade(45));
    }

    @Test
    public void testBoundaryValues() {
        assertEquals("A", Grade.calculateGrade(90));
        assertEquals("B", Grade.calculateGrade(80));
        assertEquals("C", Grade.calculateGrade(70));
        assertEquals("F", Grade.calculateGrade(69));
    }

    @Test
    public void testTotal() {
        assertEquals(255, Grade.calculateTotal(95, 85, 75));
    }

    @Test
    public void testAverage() {
        assertEquals(85.0, Grade.calculateAverage(95, 85, 75));
    }
}
