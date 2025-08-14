package ua.javarush.task.pro.task18.task1802;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static ArrayList<Student> students = new ArrayList<>();

    public static void main(String[] args) {
        Collections.addAll(students,
                new Student("Student1", 22),
                new Student("Student2", 18),
                new Student("Student3", 19)
        );

        Collections.sort(students, new AgeComparator());

        for (Student student : students) {
            System.out.println(student);
        }
    }
}
