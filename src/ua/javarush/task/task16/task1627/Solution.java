package ua.javarush.task.task16.task1627;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        OnlineGame onlineGame = new OnlineGame();
        onlineGame.start();
    }

    public static class OnlineGame extends Thread {
        public static volatile boolean isWinnerFound = false;

        public static List<String> steps = new ArrayList<String>();

        static {
            steps.add("Початок гри");
            steps.add("Збір ресурсів");
            steps.add("Ріст економіки");
            steps.add("Вбивство ворогів");
        }

        protected Gamer gamer1 = new Gamer("Ivanov", 3);
        protected Gamer gamer2 = new Gamer("Petrenko", 1);
        protected Gamer gamer3 = new Gamer("Sydorchuk", 5);

        public void run() {
            gamer1.start();
            gamer2.start();
            gamer3.start();

            while (!isWinnerFound) {
            }
            gamer1.interrupt();
            gamer2.interrupt();
            gamer3.interrupt();
        }
    }

    public static class Gamer extends Thread {
        private int rating;

        public Gamer(String name, int rating) {
            super(name);
            this.rating = rating;
        }

        @Override
        public void run() {
            int i = 0;
            try {
                while (i < OnlineGame.steps.size()) {
                    System.out.println(getName() + ":" + OnlineGame.steps.get(i));
                    i++;
                    Thread.sleep(1000 / rating);
                }
                if (!OnlineGame.isWinnerFound) {
                    OnlineGame.isWinnerFound = true;
                    System.out.println(getName() + ":переможець!");
                }
            } catch (InterruptedException e) {
                System.out.println(getName() + ":програв");
            }
        }
    }
}
