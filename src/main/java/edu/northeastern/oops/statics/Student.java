package edu.northeastern.oops.statics;

public class Student {
    private static int totalStudents = 0;
    private String name;
    private int id;

    public Student(String name) {
        this.name = name;
        this.id = ++totalStudents;
    }

    // Getter for totalStudents
    public static int getTotalStudents() {
        return totalStudents;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for id
    public int getId() {
        return id;
    }

    // TODO: Add a function to reset the total number of students to 0.
    public static void resetTotalStudents(){}
}
