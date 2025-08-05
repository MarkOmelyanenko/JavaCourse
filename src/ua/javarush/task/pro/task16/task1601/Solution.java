package ua.javarush.task.pro.task16.task1601;

import java.util.Date;

public class Solution {

    static Date birthDate = new Date(105, 2, 15);

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(Date date) {
        int dayOfWeek = date.getDay();

        return switch (dayOfWeek) {
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> throw new IllegalStateException("Unexpected value: " + dayOfWeek);
        };
    }
}
