package ua.javarush.task.pro.task17.task1716;


public interface Vehicle {

    default void start() {
        System.out.println("I start moving.");
    }

    default void stop() {
        System.out.println("I stop.");
    }
}
