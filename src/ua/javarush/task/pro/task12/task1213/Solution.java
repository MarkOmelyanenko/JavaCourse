package ua.javarush.task.pro.task12.task1213;

import java.util.ArrayList;

public class Solution {
    public static ArrayList<String> planets = new ArrayList<>();

    public static void main(String[] args) {
        addPlanets();
        print();
        createNewPlanet("Зоря Смерті");
        print();
    }

    public static void createNewPlanet(String planetName) {
        for (int i = 0; i < planets.size(); i++) {
            if (planets.get(i).equals("Земля")) {
                planets.add(i + 1, planetName);
            }
        }
    }

    public static void addPlanets() {
        planets.add("Меркурій");
        planets.add("Венера");
        planets.add("Земля");
        planets.add("Марс");
        planets.add("Юпітер");
        planets.add("Сатурн");
        planets.add("Уран");
        planets.add("Нептун");
    }

    public static void print() {
        for (int i = 0; i < planets.size(); i++) {
            System.out.println(String.format("%s — %d-а (-я) планета від Сонця", planets.get(i), (i + 1)));
        }
        System.out.println();
    }
}
