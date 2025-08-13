package ua.javarush.task.pro.task17.task1705;

import java.util.ArrayList;

public class Solution {
    public static ArrayList<Astronaut> astronauts = new ArrayList<>();

    public static void main(String[] args) {
        createCrew();
        printCrewInfo();
        runWorkingProcess();
    }

    public static void runWorkingProcess() {
        for (Astronaut astronaut : astronauts) {
            if (astronaut instanceof Human) {
                Human human = (Human) astronaut;
                pilot(human);
            } else if (astronaut instanceof Dog) {
                Dog dog = (Dog) astronaut;
                createDirection(dog);
            } else if (astronaut instanceof Cat) {
                Cat cat = (Cat) astronaut;
                research(cat);
            }
        }
    }

    public static void pilot(Human human) {
        System.out.println("Crew member " + human.getInfo() + " pilots the ship.");
    }

    public static void createDirection(Dog dog) {
        System.out.println("Crew member " + dog.getInfo() + " is engaged in creating a navigation route.");
    }

    public static void research(Cat cat) {
        System.out.println("Crew member " + cat.getInfo() + " explores the nearest planets.");
    }

    public static void createCrew() {
        astronauts.add(new Human());
        astronauts.add(new Human());
        astronauts.add(new Dog());
        astronauts.add(new Cat());
    }

    public static void printCrewInfo() {
        System.out.println("The crew members arrived on board:");
        for (Astronaut astronaut : astronauts) {
            System.out.println(astronaut.getInfo());
        }
    }
}
