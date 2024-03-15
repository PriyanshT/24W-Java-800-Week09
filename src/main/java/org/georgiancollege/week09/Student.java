package org.georgiancollege.week09;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Student implements Comparable<Student> {
    private int studentId;
    private String firstName, lastName;
    private HashMap<String, Integer> grades;

    public Student(int studentId, String firstName, String lastName) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.grades = new HashMap<>();
    }

    public void addGrades(String courseCode, int marks){
        if(courseCode.matches("[A-Z]{4}\\s\\d{4}")){
            if(marks < 0 || marks > 100){
                throw new IllegalArgumentException("Marks should be between 0 and 100;");
            } else {
                grades.put(courseCode, marks);
            }
        } else {
            throw new IllegalArgumentException("The course code should start with 4 capital letters, " +
                    "followed by a space, and followed by 4 digits.");
        }
    }

    public Set<String> getCourseCodes(){
        return grades.keySet();
    }

    public Collection<Integer> getMarks(){
        return grades.values();
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public int compareTo(Student otherStudent) {
        return (otherStudent.studentId - this.studentId);
    }
}
