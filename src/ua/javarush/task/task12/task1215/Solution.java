package ua.javarush.task.task12.task1215;

public class Solution {

    public static void main(String[] args) {

    }

    public static abstract class Pet {
        public abstract String getName();

        public abstract Pet getChild();
    }

    public static class Cat extends Pet {

        public String getName() {
            return "A cat";
        }

        public Pet getChild() {
            return new Cat();
        }
    }

    public static class Dog extends Pet {

        public String getName() {
            return "A dog";
        }

        public Pet getChild() {
            return new Dog();
        }
    }
}
