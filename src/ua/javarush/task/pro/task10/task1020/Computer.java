package ua.javarush.task.pro.task10.task1020;

public class Computer {
    private final Keyboard keyboard;
    private final Monitor monitor;
    private final Mouse mouse;
    private final SystemUnit systemUnit;

    public Computer() {
        keyboard = new Keyboard();
        monitor = new Monitor();
        mouse = new Mouse();
        systemUnit = new SystemUnit();
    }
}
