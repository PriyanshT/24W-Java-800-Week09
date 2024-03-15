package org.georgiancollege.week09;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");

        // create student objects
        Student student1 = new Student(1, "ABC", "XYZ");
        student1.addGrades("COMP 1011", 70);
        student1.addGrades("COMP 1012", 50);
        student1.addGrades("COMP 1013", 30);

        Student student2 = new Student(2, "ABC2", "XYZ2");
        student2.addGrades("COMP 1011", 72);
        student2.addGrades("COMP 1012", 52);
        student2.addGrades("COMP 1013", 32);

        Student student3 = new Student(3, "ABC3", "XYZ3");
        student3.addGrades("COMP 1011", 75);
        student3.addGrades("COMP 1012", 55);
        student3.addGrades("COMP 1013", 35);

        // array list
        ArrayList<Student> studentArrayList = new ArrayList<>();
        studentArrayList.add(student1);
        studentArrayList.add(student2);
        studentArrayList.add(student3);
        studentArrayList.add(student1);

        // hashset
        HashSet<Student> studentHashSet = new HashSet<>();
        studentHashSet.addAll(studentArrayList);

        // tree set
        TreeSet<Student> studentTreeSet = new TreeSet<>();
        studentTreeSet.addAll(studentArrayList);
    }
}