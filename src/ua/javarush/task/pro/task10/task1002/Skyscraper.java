package ua.javarush.task.pro.task10.task1002;

public class Skyscraper {
    public static final String SKYSCRAPER_WAS_BUILD = "Хмарочос побудовано.";
    public static final String SKYSCRAPER_WAS_BUILD_FLOORS_COUNT = "Хмарочос побудовано. Кількість поверхів - ";
    public static final String SKYSCRAPER_WAS_BUILD_DEVELOPER = "Хмарочос побудовано. Забудовник - ";

    public Skyscraper() {
        System.out.println(SKYSCRAPER_WAS_BUILD);
    }

    public Skyscraper(int floors) {
        System.out.println(SKYSCRAPER_WAS_BUILD_FLOORS_COUNT + floors);
    }

    public Skyscraper(String builder) {
        System.out.println(SKYSCRAPER_WAS_BUILD_DEVELOPER + builder);
    }

    public static void main(String[] args) {
        Skyscraper skyscraper = new Skyscraper();
        Skyscraper skyscraperTower = new Skyscraper(50);
        Skyscraper skyscraperSkyline = new Skyscraper("JavaRushDevelopment");
    }
}

