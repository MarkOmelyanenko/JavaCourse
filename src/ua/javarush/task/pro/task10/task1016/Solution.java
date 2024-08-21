package ua.javarush.task.pro.task10.task1016;

public class Solution {

    public static void showWeather(City city) {
        System.out.println(String.format("""
                У місті %s сьогодні температура повітря %d
                """, city.getName(), city.getTemperature()));
    }

    public static void main(String[] args) {
        showWeather(new City("Kyiv", 25));
    }
}
