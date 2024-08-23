package ua.javarush.task.pro.task11.task1101;

public class Solution {

    public static void main(String[] args) {

        System.out.println("Людство живе в Сонячній системі.");
        System.out.println("Її вік близько %d років.".formatted(SolarSystem.age));
        System.out.println("У Сонячній системі %d відомих планет.".formatted(SolarSystem.planetsCount));
        System.out.println("Так само, як і більшість зоряних систем, вона має %d зорю.".formatted(SolarSystem.starsCount));
        System.out.println("Зорю на ім'я %s.".formatted(SolarSystem.starName));
        System.out.println("Відстань до центра галактики становить %d світлових років.".formatted(SolarSystem.galacticCenterDistance));
        System.out.println("Кожен мешканець Сонячної системи має знати цю інформацію!");

    }
}
