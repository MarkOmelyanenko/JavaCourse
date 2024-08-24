package ua.javarush.task.pro.task13.task1309;

import java.util.HashMap;

public class Solution {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println(grades);
    }

    public static void addStudents() {
        grades.put("Ghost", 4.5);
        grades.put("Angel", 5.0);
        grades.put("Captain Price", 4.7);
        grades.put("March", 3.0);
        grades.put("Nobody", 2.0);
    }
}
