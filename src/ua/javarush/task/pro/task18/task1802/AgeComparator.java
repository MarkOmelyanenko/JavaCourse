package ua.javarush.task.pro.task18.task1802;

import java.util.Comparator;

public class AgeComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s2.getAge() - s1.getAge();
    }
}
