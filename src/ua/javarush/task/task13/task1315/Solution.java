package ua.javarush.task.task13.task1315;

public class Solution {
    public static void main(String[] args) {
    }

    public interface Movable {
        void move();
    }

    public interface Edible {
        void beEaten();
    }

    public interface Eat {
        void eat();
    }

    public class Cat implements Movable, Edible, Eat {
        @Override
        public void eat() {

        }

        @Override
        public void beEaten() {

        }

        @Override
        public void move() {

        }
    }

    public class Mouse implements Movable, Edible {
        @Override
        public void beEaten() {

        }

        @Override
        public void move() {

        }
    }

    public class Dog implements Movable, Eat {
        @Override
        public void eat() {

        }

        @Override
        public void move() {

        }
    }
}