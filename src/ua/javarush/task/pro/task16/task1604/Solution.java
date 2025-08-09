package ua.javarush.task.pro.task16.task1604;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Solution {

    static Calendar birthDate = new GregorianCalendar(2005, Calendar.MARCH, 15);

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(Calendar calendar) {

        return switch (calendar.get(Calendar.DAY_OF_WEEK)) {
            case 1 -> "Sunday";
            case 2 -> "Monday";
            case 3 -> "Tuesday";
            case 4 -> "Wednesday";
            case 5 -> "Thursday";
            case 6 -> "Friday";
            case 7 -> "Saturday";
            default -> "Unknown";
        };
    }
}
