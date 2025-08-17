package ua.javarush.task.task12.task1212;

public class Solution {

    public static void main(String[] args) {

    }

    public static abstract class Pet {
        public String getName() {
            return "I am a cat.";
        }

        public abstract Pet getChild();
    }
}
