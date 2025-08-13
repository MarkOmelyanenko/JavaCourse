package ua.javarush.task.pro.task17.task1706;

public class Solution {
    public static void main(String[] args) {
        printRation(new Cow());
        printRation(new Lion());
        printRation(new Elephant());
        printRation(new Wolf());
    }

    public static void printRation(Animal animal){
        String herbivore = "Loves grass";
        String predator = "Loves meat";

        if (animal instanceof Cow) {
            System.out.println(herbivore);
        } else if (animal instanceof Lion) {
            System.out.println(predator);
        } else if (animal instanceof Wolf) {
            System.out.println(predator);
        } else if (animal instanceof Elephant) {
            System.out.println(herbivore);
        }
    }
}
