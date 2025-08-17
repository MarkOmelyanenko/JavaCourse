package ua.javarush.task.task12.task1221;

public class Solution {
    public static void main(String[] args) {
        Pet pet = new Cat();

        System.out.println(pet.getName());
    }

    public static class Pet {
        public String getName() {
            return "I am a fluffy one";
        }
    }

    public static class Cat extends Pet {
        @Override
        public String getName() {
            return "I am a cat";
        }
    }
}
