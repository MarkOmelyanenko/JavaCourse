package ua.javarush.task.task15.task1530;

public class TeaMaker extends DrinkMaker {

    @Override
    public void getRightCup() {
        System.out.println("Беремо чашку для чаю");
    }

    @Override
    public void putIngredient() {
        System.out.println("Насипаємо чай");
    }

    @Override
    public void pour() {
        System.out.println("Заливаємо окропом");
    }
}
