package edu.northeastern.oops.statics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {
    Student student1;
    Student student2;

    @BeforeEach
    void setUp() {
        student1 = new Student("Alice");
        student2 = new Student("Bob");
    }

    @Test
    void testGetTotalStudents() {
        // Ensure that the total number of students is correctly calculated
        assertEquals(2, Student.getTotalStudents());
    }

    @Test
    void testResetTotalStudents() {
        // Ensure that resetting the total number of students works as expected
        Student.resetTotalStudents();
        assertEquals(0, Student.getTotalStudents());
    }
}
