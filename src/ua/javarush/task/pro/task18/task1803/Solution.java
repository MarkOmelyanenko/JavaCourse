package ua.javarush.task.pro.task18.task1803;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static ArrayList<JavaRushMentor> mentors = new ArrayList<>();

    public static void main(String[] args) {
        Collections.addAll(mentors,
                new JavaRushMentor("John Bobrov"),
                new JavaRushMentor("Risha"),
                new JavaRushMentor("Eleanor Kerry"),
                new JavaRushMentor("Hans Noodles"),
                new JavaRushMentor("Kim"),
                new JavaRushMentor("Julio Siesta"),
                new JavaRushMentor("Diego"),
                new JavaRushMentor("Laga Bilaabo")
        );

        Collections.sort(mentors, new NameComparator());

        for (JavaRushMentor mentor : mentors) {
            System.out.println(mentor);
        }
    }
}
