package ua.javarush.task.pro.task17.task1707;

public class Cat extends Pet {
    public static final String CAT = "Я don't like people.";

    public void printInfo() {
        super.printInfo();
        System.out.println(CAT);
    }
}
