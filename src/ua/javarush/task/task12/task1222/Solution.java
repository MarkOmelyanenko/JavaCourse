package ua.javarush.task.task12.task1222;

public class Solution {

    public static void main(String[] args) {
        Pet pet = new Cat();
        pet.setName("I'm a fluffy one");

        System.out.println(pet.getName());
    }

    public static class Pet {
        protected String name;

        public Pet() {
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

    }

    public static class Cat extends Pet {
        public void setName(String name) {
            this.name = "I'm cat";
        }
    }
}
